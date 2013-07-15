LearnEnglish
============

D_LearnEnglish 114.zip D_LearnEnglish from Dildar Khan Waifad, Maharashtra , India

Android based application for aakash talet to learn english in Marathi.
Features

        This is android based app specially designed for aakash tablet.
        This app is help full to learn English for the students of middle and high school.




Alternate installation from your system

        Connect Aakash to your system using an USB data cable.

        Download and extract install.zip on your system

        Extract the zip file using

        unzip install.zip

        cd to install directory

        cd install

        and execute install.sh

        sudo ./install.sh

    Wait for the script to copy all necessary files to Aakash. After successful installation the device will reboot for changes to take effect.

Manual installation

        Download compressed image to your computer from this link. Extract it using

        tar -xvzf D_LearnEnglish.tar.gz

        The untar process of above file will produce D_LearnEnglish.img. Copy D_LearnEnglish.img to sdcard(internal or external) of your Aakash tablet.

        Then install D_LearnEnglish.apk on Aakash, shutdown and start Aakash to finish installation. Now locate D_LearnEnglish icon in your android menu to start using Aakash Business Tool

Usage

This branch contains an Android(4.0.3, API-15) code for the User Interface of Aakash Business Tool.

User's can clone this repo by typing

git clone -b ics https://github.com/androportal/D_LearnEnglish.git

if you want to clone code for Android(2.2, API-8), type

git clone -b froyo https://github.com/androportal/D_LearnEnglish.git

note: this branch(froyo) is obsolete

if you want to checkout all branches then type,

git checkout -b ics remotes/origin/ics
git checkout -b docs remotes/origin/docs
git checkout -b froyo remotes/origin/froyo

Importing D_LearnEnglish as an eclipse project

Note: we have used Eclipse version 3.7.2(Indigo), even Eclipse 4.x(Juno) is fine to work with

    For setting up Android SDK and AVD, please visit this link
    You need to configure ADT plugin on eclipse to work on Android code. Please visit Installing ADT for detail installation instructions.

After cloning the require branch, start eclipse

    go-to File menu -> Import
    from the Import dialog box, select Android
    from Android section, select Existing Android Code Into Workspace and click Next button.
    you will be taken to Import Projects dialog box, click Browse button and select the cloned repository

Important note

To test Aakash Business Tool on emulator, go to

    D_LearnEnglish/src/com/gkaakash/coreconection/CoreConnection.java and change the url from http://127.0.0.1:7081 to http://10.0.2.2:7081

    D_LearnEnglish/src/com/example/gkaakash/MainActivity, comment those line number which invokes

    help_popup()

    function.

    D_LearnEnglish/src/com/example/gkaakash/createOrg, and comment below two line

    MainActivity.no_dailog = true;
    MainActivity.help_dialog.dismiss();

    D_LearnEnglish/src/com/example/gkaakash/selectOrg, and comment line which says

    MainActivity.no_dailog = true;

Documentation

For User and developer's guide, please visit https://drive.google.com/#my-drive

Documentation in raw sphinx format can be cloned from

git clone -b docs https://github.com/androportal/D_LearnEnglish.git

please refer README.rst on how to generate html docs
Help, bugs, feedback

    Users can mail their queries, feedback and suggestions at accounting-on-aakash@googlegroups.com
    Developers/Contributor can raise issues at issues
    Pull requests are most welcome

License

GNU GPL Version 3, 29 June 2007.

Please refer this link for detailed description.

All rights belong to the National Mission on Education through ICT, MHRD, Government of India.
