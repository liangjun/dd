package com.liang;

public class Contact {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.id
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.firstName
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    private String firstname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.lastName
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    private String lastname="";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.phone
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.email
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    private String email;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.id
     *
     * @return the value of contact.id
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.id
     *
     * @param id the value for contact.id
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.firstName
     *
     * @return the value of contact.firstName
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.firstName
     *
     * @param firstname the value for contact.firstName
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.lastName
     *
     * @return the value of contact.lastName
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.lastName
     *
     * @param lastname the value for contact.lastName
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    public void setLastname(String lastname) {
    	if(lastname!=null)
    		this.lastname = lastname;
    	else
    		this.lastname = "";
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.phone
     *
     * @return the value of contact.phone
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.phone
     *
     * @param phone the value for contact.phone
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.email
     *
     * @return the value of contact.email
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.email
     *
     * @param email the value for contact.email
     *
     * @mbggenerated Wed Jul 18 16:41:21 CST 2012
     */
    public void setEmail(String email) {
        this.email = email;
    }
}