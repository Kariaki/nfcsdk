# Recyclerview-helper-library

This is a helper for recyclerview adapter and viewholder

How to
To get a Git project into your build:

Add this to your build.gradle file  
 implementation 'com.github.Kariaki:Recyclerview-helper-library:1.0'

• Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 
• Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Kariaki:Recyclerview-helper-library:1.0'
	}
 
 # How to use
 
 In your activity or Fragment create an Instance of GeneralAdapter class.
 **General Adapter class** 
 The class has a No-arguement constructor
 You are required to set the following properties using the **set method in java** or the properties in kotlin
 
    • Items
    • superClickListener
    • viewholderPlug
    
   **Items**
   Items is a List of SuperEntity class
   
   **SuperEntitiy**
   You should extend the SuperEntity class with your Custom Adapter classes and then handle the type property.
   
   **SuperClickListener**
   This is Just an Interface that handles click items.
   The interface has only one method **OnclickItem(int position)**
   you can extend the interface to add your own custom implementation
   
   **GeneralAdapter.ViewholderPlug**
   This is a an instance of the **MainViewHolder(View view) class**
   
