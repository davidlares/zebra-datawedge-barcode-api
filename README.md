# Zebra DataWedge Barcode API integration demo

This DWApp is for demo purposes, it's untested for production environments. It uses a `Zebra's DataWedge` profile with an Android intent for the barcode scanning redirection.

The staging phase of the `DataWedge` profile is found [here](http://takeiteasy.zone/files/dwprofile_CustomProfile_db). The name of the custom profile generated is `dwprofile_CustomProfile.db`. Once the file is set up, you can use `Zebra's StageNow` to provision your complete configuration prior to the app installation and usage.

## StageNow full PDF file

Plase check the `stagenow.pdf` file

## StageNow PDF417 barcode

![StageNow Custom profile](https://cdn-101.anonfiles.com/F2R0Z32ez1/21772ef6-1689777281/Screenshot+%281784%29.png)

## (Optional) Creating the DataWedge profile manually

You'll need to follow these steps

1. Create a custom profile, name it as you want. Ex: CustomProfile
2. Set it to active
3. Enable the barcode input
4. Set the intent input active
5. Set as intent `com.davidlares.DWApp.ACTION` and leave the category as default

## Credits

 - [David E Lares](https://twitter.com/davdlares)

## License

 - [MIT](https://opensource.org/licenses/MIT)
