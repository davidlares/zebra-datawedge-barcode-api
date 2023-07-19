# Zebra DataWedge Barcode API integration demo

This DWApp is for demo purposes, it's untested for production environments. It uses a `Zebra's DataWedge` profile with an Android intent for the barcode scanning redirection.

The staging phase of the `DataWedge` profile is found [here](https://anonfiles.com/defeWe23z2/dwprofile_CustomProfile_db). You'll need to place your profile file inside the `C:\datawedge` directory, and the name of the file `dwprofile_CustomProfile.db`. Once the file is set up, you can use `Zebra's StageNow` to provision your complete configuration prior to the app installation and usage.

## StageNow full PDF file

Plase check the `stagenow.pdf` file

## StageNow PDF417 barcode

![StageNow Custom profile](https://cdn-141.anonfiles.com/96g4W22ez2/42cf334f-1689742182/stagenow-custom-profile.png)

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
