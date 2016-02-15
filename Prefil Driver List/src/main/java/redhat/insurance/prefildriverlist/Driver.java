package redhat.insurance.prefildriverlist;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Driver")
public class Driver implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label("Driver License Number")
   private java.lang.String driverLicenseNumber;
   @org.kie.api.definition.type.Label("Date of Birth")
   private String dateOfBirth;
   @org.kie.api.definition.type.Label("Duplicate?")
   private boolean duplicate;
   @org.kie.api.definition.type.Label("Age")
   private java.lang.Integer age;
   @org.kie.api.definition.type.Label("Rating")
   private Integer rating;

   @org.kie.api.definition.type.Label("DLN Provided?")
   private boolean dlnProvided;

   @org.kie.api.definition.type.Label("DOB Provided?")
   private boolean dobProvided;

   @org.kie.api.definition.type.Label("Driver Type")
   private java.lang.String type;

   @org.kie.api.definition.type.Label(value = "Display Flag")
   private boolean displayed;

   @org.kie.api.definition.type.Label(value = "Display Message")
   private java.lang.String displayMessage;

   public Driver()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getDriverLicenseNumber()
   {
      return this.driverLicenseNumber;
   }

   public void setDriverLicenseNumber(java.lang.String driverLicenseNumber)
   {
      this.driverLicenseNumber = driverLicenseNumber;
   }

   public boolean isDuplicate()
   {
      return this.duplicate;
   }

   public void setDuplicate(boolean duplicate)
   {
      this.duplicate = duplicate;
   }

   public java.lang.Integer getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.Integer age)
   {
      this.age = age;
   }

   public java.lang.String getDateOfBirth()
   {
      return this.dateOfBirth;
   }

   public void setDateOfBirth(java.lang.String dateOfBirth)
   {
      this.dateOfBirth = dateOfBirth;
   }

   public boolean isDlnProvided()
   {
      return this.dlnProvided;
   }

   public void setDlnProvided(boolean dlnProvided)
   {
      this.dlnProvided = dlnProvided;
   }

   public boolean isDobProvided()
   {
      return this.dobProvided;
   }

   public void setDobProvided(boolean dobProvided)
   {
      this.dobProvided = dobProvided;
   }

   public java.lang.Integer getRating()
   {
      return this.rating;
   }

   public void setRating(java.lang.Integer rating)
   {
      this.rating = rating;
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public boolean isDisplayed()
   {
      return this.displayed;
   }

   public void setDisplayed(boolean displayed)
   {
      this.displayed = displayed;
   }

   public java.lang.String getDisplayMessage()
   {
      return this.displayMessage;
   }

   public void setDisplayMessage(java.lang.String displayMessage)
   {
      this.displayMessage = displayMessage;
   }

   public Driver(java.lang.String name, java.lang.String driverLicenseNumber,
         java.lang.String dateOfBirth, boolean duplicate, java.lang.Integer age,
         java.lang.Integer rating, boolean dlnProvided, boolean dobProvided,
         java.lang.String type, boolean displayed,
         java.lang.String displayMessage)
   {
      this.name = name;
      this.driverLicenseNumber = driverLicenseNumber;
      this.dateOfBirth = dateOfBirth;
      this.duplicate = duplicate;
      this.age = age;
      this.rating = rating;
      this.dlnProvided = dlnProvided;
      this.dobProvided = dobProvided;
      this.type = type;
      this.displayed = displayed;
      this.displayMessage = displayMessage;
   }

}