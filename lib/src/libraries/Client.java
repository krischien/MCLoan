/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;

import dbconn.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author Lancepyro
 */
public class Client extends DBConnection {

    private static int id;
    private static String account_no;
    private static String firstname;
    private static String middlename;
    private static String lastname;
    private static String gender;
    private static String civil_status;
    private static String birthdate;
    private static String mobile_no;
    private static String landline;
    private static String email_address;
    private static String business_address;
    private static String street;
    private static String barangay;
    private static String city_province;
    private static String cedula;
    private static String place_issued;
    private static String date_issued;
    private static String spouse_name;
    private static String spouse_birthdate;
    private static String spouse_date_of_death;
    private static byte[] photo;
    private static String date_created;
    private static String date_updated;
    private static String active;
    private static String clientBank;
    private static int branchId;
    private static Vector data;

    /**
     * @return the id
     */
    public static int getId() {
        return id;
    }

    /**
     * @param aId the id to set
     */
    public static void setId(int aId) {
        id = aId;
    }

    /**
     * @return the account_no
     */
    public static String getAccount_no() {
        return account_no;
    }

    /**
     * @param aAccount_no the account_no to set
     */
    public static void setAccount_no(String aAccount_no) {
        account_no = aAccount_no;
    }

    /**
     * @return the firstname
     */
    public static String getFirstname() {
        return firstname;
    }

    /**
     * @param aFirstname the firstname to set
     */
    public static void setFirstname(String aFirstname) {
        firstname = aFirstname;
    }

    /**
     * @return the middlename
     */
    public static String getMiddlename() {
        return middlename;
    }

    /**
     * @param aMiddlename the middlename to set
     */
    public static void setMiddlename(String aMiddlename) {
        middlename = aMiddlename;
    }

    /**
     * @return the lastname
     */
    public static String getLastname() {
        return lastname;
    }

    /**
     * @param aLastname the lastname to set
     */
    public static void setLastname(String aLastname) {
        lastname = aLastname;
    }

    /**
     * @return the gender
     */
    public static String getGender() {
        return gender;
    }

    /**
     * @param aGender the gender to set
     */
    public static void setGender(String aGender) {
        gender = aGender;
    }

    /**
     * @return the civil_status
     */
    public static String getCivil_status() {
        return civil_status;
    }

    /**
     * @param aCivil_status the civil_status to set
     */
    public static void setCivil_status(String aCivil_status) {
        civil_status = aCivil_status;
    }

    /**
     * @return the birthdate
     */
    public static String getBirthdate() {
        return birthdate;
    }

    /**
     * @param aBirthdate the birthdate to set
     */
    public static void setBirthdate(String aBirthdate) {
        birthdate = aBirthdate;
    }

    /**
     * @return the mobile_no
     */
    public static String getMobile_no() {
        return mobile_no;
    }

    /**
     * @param aMobile_no the mobile_no to set
     */
    public static void setMobile_no(String aMobile_no) {
        mobile_no = aMobile_no;
    }

    /**
     * @return the landline
     */
    public static String getLandline() {
        return landline;
    }

    /**
     * @param aLandline the landline to set
     */
    public static void setLandline(String aLandline) {
        landline = aLandline;
    }

    /**
     * @return the email_address
     */
    public static String getEmail_address() {
        return email_address;
    }

    /**
     * @param aEmail_address the email_address to set
     */
    public static void setEmail_address(String aEmail_address) {
        email_address = aEmail_address;
    }

    /**
     * @return the business_address
     */
    public static String getBusiness_address() {
        return business_address;
    }

    /**
     * @param aBusiness_address the business_address to set
     */
    public static void setBusiness_address(String aBusiness_address) {
        business_address = aBusiness_address;
    }

    /**
     * @return the street
     */
    public static String getStreet() {
        return street;
    }

    /**
     * @param aStreet the street to set
     */
    public static void setStreet(String aStreet) {
        street = aStreet;
    }

    /**
     * @return the barangay
     */
    public static String getBarangay() {
        return barangay;
    }

    /**
     * @param aBarangay the barangay to set
     */
    public static void setBarangay(String aBarangay) {
        barangay = aBarangay;
    }

    /**
     * @return the city_province
     */
    public static String getCity_province() {
        return city_province;
    }

    /**
     * @param aCity_province the city_province to set
     */
    public static void setCity_province(String aCity_province) {
        city_province = aCity_province;
    }

    /**
     * @return the cedula
     */
    public static String getCedula() {
        return cedula;
    }

    /**
     * @param aCedula the cedula to set
     */
    public static void setCedula(String aCedula) {
        cedula = aCedula;
    }

    /**
     * @return the place_issued
     */
    public static String getPlace_issued() {
        return place_issued;
    }

    /**
     * @param aPlace_issued the place_issued to set
     */
    public static void setPlace_issued(String aPlace_issued) {
        place_issued = aPlace_issued;
    }

    /**
     * @return the date_issued
     */
    public static String getDate_issued() {
        return date_issued;
    }

    /**
     * @param aDate_issued the date_issued to set
     */
    public static void setDate_issued(String aDate_issued) {
        date_issued = aDate_issued;
    }

    /**
     * @return the spouse_name
     */
    public static String getSpouse_name() {
        return spouse_name;
    }

    /**
     * @param aSpouse_name the spouse_name to set
     */
    public static void setSpouse_name(String aSpouse_name) {
        spouse_name = aSpouse_name;
    }

    /**
     * @return the spouse_birthdate
     */
    public static String getSpouse_birthdate() {
        return spouse_birthdate;
    }

    /**
     * @param aSpouse_birthdate the spouse_birthdate to set
     */
    public static void setSpouse_birthdate(String aSpouse_birthdate) {
        spouse_birthdate = aSpouse_birthdate;
    }

    /**
     * @return the spouse_date_of_death
     */
    public static String getSpouse_date_of_death() {
        return spouse_date_of_death;
    }

    /**
     * @param aSpouse_date_of_death the spouse_date_of_death to set
     */
    public static void setSpouse_date_of_death(String aSpouse_date_of_death) {
        spouse_date_of_death = aSpouse_date_of_death;
    }

    /**
     * @return the photo
     */
    public static byte[] getPhoto() {
        return photo;
    }

    /**
     * @param aPhoto the photo to set
     */
    public static void setPhoto(byte[] aPhoto) {
        photo = aPhoto;
    }

    /**
     * @return the date_created
     */
    public static String getDate_created() {
        return date_created;
    }

    /**
     * @param aDate_created the date_created to set
     */
    public static void setDate_created(String aDate_created) {
        date_created = aDate_created;
    }

    /**
     * @return the date_updated
     */
    public static String getDate_updated() {
        return date_updated;
    }

    /**
     * @param aDate_updated the date_updated to set
     */
    public static void setDate_updated(String aDate_updated) {
        date_updated = aDate_updated;
    }

    /**
     * @return the active
     */
    public static String getActive() {
        return active;
    }

    /**
     * @param aActive the active to set
     */
    public static void setActive(String aActive) {
        active = aActive;
    }

    /**
     * @return the clientBank
     */
    public static String getClientBank() {
        return clientBank;
    }

    /**
     * @param aClientBank the clientBank to set
     */
    public static void setClientBank(String aClientBank) {
        clientBank = aClientBank;
    }

    /**
     * @return the data
     */
    public static Vector getData() {
        return data;
    }

    /**
     * @param aData the data to set
     */
    public static void setData(Vector aData) {
        data = aData;
    }

    /**
     * @return the branchId
     */
    public static int getBranchId() {
        return branchId;
    }

    /**
     * @param aBranchId the branchId to set
     */
    public static void setBranchId(int aBranchId) {
        branchId = aBranchId;
    }

    public void selectAll() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select * FROM clients where active = 1");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                String account_nol = rs.getString("account_no");
                String firstnamel = rs.getString("firstname");
                String middlenamel = rs.getString("middlename");
                String lastnamel = rs.getString("lastname");
                String genderl = rs.getString("gender");
                String civil_statusl = rs.getString("civil_status");
                String birthdatel = rs.getString("birthdate");
                String mobile_nol = rs.getString("mobile_no");
                String landlinel = rs.getString("landline");
                String email_addressl = rs.getString("email_address");
                String business_addressl = rs.getString("business_address");
                String streetl = rs.getString("street");
                String barangayl = rs.getString("barangay");
                String city_provincel = rs.getString("city_province");
                String cedulal = rs.getString("cedula");
                String place_issuedl = rs.getString("place_issued");
                String date_issuedl = rs.getString("date_issued");
                String spouse_namel = rs.getString("spouse_name");
                String spouse_birthdatel = rs.getString("spouse_birthdate");
                String spouse_date_of_deathl = rs.getString("spouse_date_of_death");
                byte[] photol = rs.getBytes("photo");
                String date_createdl = rs.getString("date_created");
                String date_updatedl = rs.getString("date_updated");
                String activel = rs.getString("active");
                String clientBankl = rs.getString("client_bank");
                int branchIdl = rs.getInt("branch_id");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(account_nol);
                rows.add(firstnamel);
                rows.add(middlenamel);
                rows.add(lastnamel);
                rows.add(genderl);
                rows.add(civil_statusl);
                rows.add(genderl);
                rows.add(birthdatel);
                rows.add(mobile_nol);
                rows.add(landlinel);
                rows.add(email_addressl);
                rows.add(business_addressl);
                rows.add(streetl);
                rows.add(barangayl);
                rows.add(city_provincel);
                rows.add(cedulal);
                rows.add(place_issuedl);
                rows.add(date_issuedl);
                rows.add(spouse_namel);
                rows.add(spouse_namel);
                rows.add(spouse_date_of_deathl);
                rows.add(photol);
                rows.add(date_createdl);
                rows.add(date_updatedl);
                rows.add(activel);
                rows.add(clientBankl);
                rows.add(branchIdl);
                this.getData().add(rows);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectClient() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select * FROM clients where active = 1 and id = ?");
            stmt.setInt(1, getId());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                String account_nol = rs.getString("account_no");
                String firstnamel = rs.getString("firstname");
                String middlenamel = rs.getString("middlename");
                String lastnamel = rs.getString("lastname");
                String genderl = rs.getString("gender");
                String civil_statusl = rs.getString("civil_status");
                String birthdatel = rs.getString("birthdate");
                String mobile_nol = rs.getString("mobile_no");
                String landlinel = rs.getString("landline");
                String email_addressl = rs.getString("email_address");
                String business_addressl = rs.getString("business_address");
                String streetl = rs.getString("street");
                String barangayl = rs.getString("barangay");
                String city_provincel = rs.getString("city_province");
                String cedulal = rs.getString("cedula");
                String place_issuedl = rs.getString("place_issued");
                String date_issuedl = rs.getString("date_issued");
                String spouse_namel = rs.getString("spouse_name");
                String spouse_birthdatel = rs.getString("spouse_birthdate");
                String spouse_date_of_deathl = rs.getString("spouse_date_of_death");
                byte[] photol = rs.getBytes("photo");
                String date_createdl = rs.getString("date_created");
                String date_updatedl = rs.getString("date_updated");
                String activel = rs.getString("active");
                String clientBankl = rs.getString("client_bank");
                int branchIdl = rs.getInt("branch_id");

                setId(idl);
                setAccount_no(account_nol);
                setFirstname(firstnamel);
                setMiddlename(middlenamel);
                setLastname(lastnamel);
                setGender(genderl);
                setCivil_status(civil_statusl);
                setGender(genderl);
                setBirthdate(birthdatel);
                setMobile_no(mobile_nol);
                setLandline(landlinel);
                setEmail_address(email_addressl);
                setBusiness_address(business_addressl);
                setStreet(streetl);
                setBarangay(barangayl);
                setCity_province(city_provincel);
                setCedula(cedulal);
                setPlace_issued(place_issuedl);
                setDate_issued(date_issuedl);
                setSpouse_name(spouse_namel);
                setSpouse_birthdate(spouse_birthdatel);
                setSpouse_date_of_death(spouse_date_of_deathl);
                setPhoto(photol);
                setDate_created(date_createdl);
                setDate_updated(date_updatedl);
                setActive(activel);
                setClientBank(clientBankl);
                setBranchId(branchIdl);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void countPopulation() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("SELECT COUNT(id) as count from clients");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("count");

                this.setId(idl);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public void getClientBirthdate() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("SELECT birthdate from clients where id = ?");
            stmt.setInt(1, getId());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String idl = rs.getString("birthdate");

                this.setBirthdate(idl);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DisplayClientInfo() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM clients c LEFT JOIN pensions p ON(c.id=p.client_id) where c.active = 1");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                String account_nol = rs.getString("account_no");
                String firstnamel = rs.getString("firstname");
                String middlenamel = rs.getString("middlename");
                String lastnamel = rs.getString("lastname");
                String namel = rs.getString("name");
                String typel = rs.getString("type");
                String pension_nol = rs.getString("pension_no");
                String monthly_pensionl = rs.getString("monthly_pension");
                String date_remittancel = rs.getString("date_remittance");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(account_nol);
                rows.add(firstnamel + " " + middlenamel + " " + lastnamel);
                rows.add(namel);
                rows.add(typel);
                rows.add(pension_nol);
                rows.add(monthly_pensionl);
                rows.add(date_remittancel);
                this.getData().add(rows);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("INSERT into clients (account_no, firstname, middlename, lastname, gender, "
                    + "civil_status, birthdate, mobile_no, landline, email_address, business_address, street, barangay, city_province, "
                    + "cedula, place_issued,date_issued, spouse_name, spouse_birthdate, spouse_date_of_death, photo, date_created, "
                    + "date_updated, active, client_bank, branch_id) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW(), NOW(), ?, ?, ?)");
            stmt.setString(1, getAccount_no());
            stmt.setString(2, getFirstname());
            stmt.setString(3, getMiddlename());
            stmt.setString(4, getLastname());
            stmt.setString(5, getGender());
            stmt.setString(6, getCivil_status());
            stmt.setString(7, getBirthdate());
            stmt.setString(8, getMobile_no());
            stmt.setString(9, getLandline());
            stmt.setString(10, getEmail_address());
            stmt.setString(11, getBusiness_address());
            stmt.setString(12, getStreet());
            stmt.setString(13, getBarangay());
            stmt.setString(14, getCity_province());
            stmt.setString(15, getCedula());
            stmt.setString(16, getPlace_issued());
            stmt.setString(17, getDate_issued());
            stmt.setString(18, getSpouse_name());
            stmt.setString(19, getSpouse_birthdate());
            stmt.setString(20, getSpouse_date_of_death());
            stmt.setBytes(21, getPhoto());
            stmt.setBoolean(22, Boolean.valueOf(getActive()));
            stmt.setString(23, getClientBank());
            stmt.setInt(24, getBranchId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE clients set account_no = ?, firstname = ?, middlename = ?, lastname = ?, gender = ?, "
                    + "civil_status = ?, birthdate = ?, mobile_no = ?, landline = ?, email_address = ?, business_address = ?, street = ?, barangay = ?, city_province = ?, "
                    + "cedula = ?, place_issued = ?,date_issued = ?, spouse_name = ?, spouse_birthdate = ?, spouse_date_of_death = ?, photo = ?,"
                    + "date_updated = NOW(), active = ?, client_bank = ?, branch_id = ? WHERE id = ?");
            stmt.setString(1, getAccount_no());
            stmt.setString(2, getFirstname());
            stmt.setString(3, getMiddlename());
            stmt.setString(4, getLastname());
            stmt.setString(5, getGender());
            stmt.setString(6, getCivil_status());
            stmt.setString(7, getBirthdate());
            stmt.setString(8, getMobile_no());
            stmt.setString(9, getLandline());
            stmt.setString(10, getEmail_address());
            stmt.setString(11, getBusiness_address());
            stmt.setString(12, getStreet());
            stmt.setString(13, getBarangay());
            stmt.setString(14, getCity_province());
            stmt.setString(15, getCedula());
            stmt.setString(16, getPlace_issued());
            stmt.setString(17, getDate_issued());
            stmt.setString(18, getSpouse_name());
            stmt.setString(19, getSpouse_birthdate());
            stmt.setString(20, getSpouse_date_of_death());
            stmt.setBytes(21, getPhoto());
            stmt.setString(22, getActive());
            stmt.setString(23, getClientBank());
            stmt.setInt(24, getBranchId());
            stmt.setInt(25, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE clients set active = ?  WHERE id = ?");
            stmt.setBoolean(1, Boolean.valueOf(getActive()));
            stmt.setInt(2, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
