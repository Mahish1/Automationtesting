Feature: Tested config files

  Scenario: Test the js files
    * def niha =
      """
      function (){
       var happy = Java.type('karateframe.Genration');
       var isha = new happy();
       return isha.funny('niharika');
       Karate.configure	('connectionTimeout',5000)
       Karate.configure	('connectionTimeout',5000)
       
       }
      """
    * def funny = call niha
