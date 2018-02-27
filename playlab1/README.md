# Play Framework Lab: File Upload and Image processing

## 1. Introduction

In this lab you will add functionality to hand file uploads and image processing.

Images will not be stored in the database (that would be inefficient due to the encoding/ decoding overhead). Instead images will be stored in the public/images/productImages folder. The product id ( + .jpg) will be used as the file name.

Copy the folder lab1 from the V:drive into your virtual machine and open using the code editor.

**2. File upload from a form**

In order to upload a file, the form data must be encoded as **multipart/form-data****. **This option is set using the enctype**.

An input field of type file is also required. This input filed includes a &#39;choose file&#39; button, used to locate the file to be uploaded from the client.

### 2.1. Uploading a file

First a simple example – a file will be uploaded using the add product form and saved using the product id as the filename. Files will be saved in the public/images/productImages folder. This example expects an image upload but it should work with any type (provided the file data type is set).

### 2.2 Update the add product form

Open addProduct.scala.html for editing and modify the form, adding the enctype attribute and the upload form control.

### 2.3 Saving the file after a submit

The image needs to be saved after the form is submitted. The code required should be added to the addProductSubmit() method in the HomeCotroller.

The product image is optional so a product should be saved whether or not the image is included in the form. The product id is also required for the file name. For these reasons, add the code after the product is saved or updated in the addProductSubmit() method.

1. Retrieve the file data from the submitted form. The id of the new, just saved, product (from the form object) and the file data is then passed to the saveFile() method.
2. This method returns a string – declare saveImageMsg as a String at the top of addProductSubmit()
3. Set a message in flash and return to the products page

#### The saveFile() method in HomeController.java

This method saves the file. Read the comments in the code for more information on how this is done.

### 2.3 Test

Run the application, login and add a new product. If the file upload worked you should see a file in the productImages directory, named as the product id of type jpg.

**Note that using** File **for saving the image may not work if the play project is on a USB stick or on the Windows file system and you are running Play from the virtual machine. In that case you will have to copy the project onto the Linux file system on the VM for this part of the lab exercise to work.**

While the image was saved, the method used did not allow editing so any size image could be uploaded – including those which are too large or of the wrong type.

## 3. Image Processing with ImageMagik

Improve the saveFile() method by adding the ability to resize and convert image formats.

Although Java has built in image editing functions, there are better alternatives which are more efficient and produce better quality results.

### 3.1 ImageMagik

ImageMagik is a collection of tools for creating and editing images. It is an external resource which must be installed in the OS. It is installed on the WMDD1 virtual machine but if you want to complete the lab on a different computer, what follows are instructions on installing it.

#### 3.1.1 Installing ImageMagik on a computer other than the WMDD1 virtual machine

To download for your OS, see [http://www.imagemagick.org/script/binary-releases.php](http://www.imagemagick.org/script/binary-releases.php) .

ow use the following two commands to install the tools

sudo apt-get install libmagickwand-dev imagemagick

sudo apt-get install libmagickcore-dev

#### When the tools have downloaded, you should see the following message. Type Y

#### To Install in Windows

Install using latest binary installer (first link in the windows download page).

In windows the IM4JAVA\_TOOLPATH environment variable must be set to the location of the ImageMagik install directory in C:\Program Files, e.g.

IM4JAVA\_TOOLPATH = C:\Program Files\ImageMagick\

**Note your default install location may be different.**

### 3.2 Im4java

Im4java is a Java interface for ImageMagik, enabling the features of ImageMagik to be used from Java code.

Copy the jar file from the V:drive and place it in a folder named lib in the root of the play framework project.

Sbt will automatically include anything in the lib folder during build.

### 3.3 Using ImageMagik to upload an image

First, add imports for the im4Java classes to AdminController.java

## 4. Display the image

There are images available in the thumbnails folder on V:drive for most of the products that already exist in the database. Create a new folder called productImages/thumbnails Copy these images (thumbnails) into the productImages/thumbnails filder.

Now test the application.

## 5. To Do (exercise)

### 5.1 Add a product detail page.

When a product name is selected (in list products), open a new page (e.g. productDetails.scala.html) where the selected product is displayed along with the full size image.

The full size images are available in the largeImages folder on V:drive. Copy these images into the productImages/ folder.