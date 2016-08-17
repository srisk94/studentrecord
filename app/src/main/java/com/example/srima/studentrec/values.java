package com.example.srima.studentrec;

/**
 * Created by srima on 16-08-2016.
 */
public class values {
    // private variables
    public int _id;
    public String _name;
    public String _lastname;




    // constructor
    public values(int id, String name, String _lastname) {
        this._id = id;
        this._name = name;
        this._lastname = _lastname;


    }

    // constructor
    public values(String name, String _lastname) {
        this._name = name;
        this._lastname = _lastname;

    }

    public values() {

    }

    // getting ID
    public int getID() {
        return this._id;
    }

    // setting id
    public void setID(int id) {
        this._id = id;
    }

    // getting name
    public String getName() {
        return this._name;
    }

    // setting name
    public void setName(String name) {
        this._name = name;
    }

    // getting phone number
    public String getlastname() {
        return this._lastname;
    }

    // setting phone number
    public void setlastname(String lastname) {
        this._lastname = lastname;
    }


}
