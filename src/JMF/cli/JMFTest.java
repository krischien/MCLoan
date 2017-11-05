package JMF.cli;

import javax.media.*;
import javax.swing.*;
import java.awt.*;
import javax.media.control.FrameGrabbingControl;
import javax.media.format.VideoFormat;
import javax.media.util.BufferToImage;

public final class JMFTest {

    private static JMFTest instance;

    public static JMFTest getInstance() {
        if (instance == null) {
            instance = new JMFTest();
        }
        return instance;
    }
    private Player player;
    private String mediaFile = "vfw://0";

    JMFTest() {
        try {
            MediaLocator mlr = new MediaLocator(mediaFile);
            player = Manager.createRealizedPlayer(mlr);
            player.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occured while connecting to the image capture device.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void stopCapture() {
        player.stop();
        player.deallocate();
        player.close();
    }

    public Component getVisualComponent() {
        return player.getVisualComponent();
    }


    public Image captureRawImage() {
        FrameGrabbingControl fgc = (FrameGrabbingControl) player.getControl("javax.media.control.FrameGrabbingControl");
        Buffer buf = fgc.grabFrame();
        BufferToImage btoi = new BufferToImage((VideoFormat) buf.getFormat());
        Image img = btoi.createImage(buf);
        return img;
    }


    static float defaultQuality = 0.3f;


    public static class Result {

        private Image image;
        private String filename;

        /**
         * @return the image
         */
        public Image getImage() {
            return image;
        }

        /**
         * @param image the image to set
         */
        public void setImage(Image image) {
            this.image = image;
        }

        /**
         * @return the filename
         */
        public String getFilename() {
            return filename;
        }

        /**
         * @param filename the filename to set
         */
        public void setFilename(String filename) {
            this.filename = filename;
        }
    }
}
