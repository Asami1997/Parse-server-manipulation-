/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.text.LoginFilter;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
                      //Saving
      /*
      //Score is the class name
      //creating new parse o object inside class score , its the row
      ParseObject score = new ParseObject("Score"); //if  score dosent exists , parse will create it
      //here it means we creating one object in class score and give it two lets say attributes , username and score
      score.put("username","Ahmad");
      score.put("score",90);
      //we have a number of ways to save
    //save callback will tell us if our object is successfully saved
     score.saveInBackground(new SaveCallback() {
       @Override
       public void done(ParseException e) {

             if(e == null)
                {
                  Log.i("SaveInBackground","Successful");

                }else
                    {
                      Log.i("SaveInBackground","Failed"+e.toString());
                    }
       }
     });
    */
                            //Getting the data back from parse, we are gettinhgthe hall object

      //perform the query on a parse Object

      /*
      ParseQuery<ParseObject> query = ParseQuery.getQuery("Score"); //we are getting from class score
      query.getInBackground("qVNAwkPHyT", new GetCallback<ParseObject>() { //every parse object has an id
          @Override
          public void done(ParseObject object, ParseException e) {

              if(e == null && object != null)
                 {
                    Log.i("username",object.getString("username"));
                     Log.i("Score",String.valueOf(object.getInt("score")));

                     //lets say we want to update our score
                         object.put("score",390);
                         object.saveInBackground();  //we are no checking for callback here if its done

                 }else
                       {
                         Log.i("Getting Data","Failed");
                       }

          }
      });
*/

      /*
      ParseObject tweet = new ParseObject("Tweets"); //creating or opening the class

      //saving attributes in the object row
      tweet.put("username","Sami");
      tweet.put("tweet","Android is Amazing");

      //saving the Object in  teh tweet class in parse
      tweet.saveInBackground(new SaveCallback() {
          @Override
          public void done(ParseException e) {

              if(e == null)
                 {
                   Log.i("Success","Yes");

                 }  else
                         {
                           Log.i("Success","No");
                         }
          }
      });
      */

      //getting the object to look at it or update it

      /*
      ParseQuery<ParseObject> query = ParseQuery.getQuery("Tweets");

      query.getInBackground("W7J90DSNxY", new GetCallback<ParseObject>() { //choose which object in the class
          @Override
          public void done(ParseObject object, ParseException e) {

               if(e == null &&  object != null)
                  {
                    Log.i("Tweet before updating",object.getString("tweet"));

                      object.put("tweet","Android is Hard");
                      //Save it in parse man
                      object.saveInBackground();

                      Log.i("Tweet After Updating",object.getString("tweet"));


                  }
          }
      });
      */

                         //Advanced Quires

      //getting all the scores

      /*
        ParseQuery<ParseObject> query = ParseQuery.getQuery("Score"); // perofrming the queru on the Score Class


       query.findInBackground(new FindCallback<ParseObject>() {   //query is
           @Override
           public void done(List<ParseObject> objects, ParseException e) {

                if(e == null)
                   {
                      Log.i("ObjectsList Size",String.valueOf(objects.size()));

                       if(objects.size() > 0)
                          {
                              for(ParseObject tempParseObject : objects)
                                 {
                                    Log.i("Object ", tempParseObject.toString());



                                 }
                          }
                   }
           }
       });
*/
      //if i want to get ahamd's score specifically for example then we get only the object that contains ahamd's username.

      /*
      ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");

      query.whereEqualTo("username","Ahmad");

      query.findInBackground(new FindCallback<ParseObject>() {
          @Override
          //List will contain only the objects that contain ahmad as username

          public void done(List<ParseObject> objects, ParseException e) {

              if(e == null)
              {
                  Log.i("ObjectsList Size",String.valueOf(objects.size()));

                  if(objects.size() > 0)
                  {
                      for(ParseObject tempParseObject : objects)
                      {
                          //Then we can get the scorec for objects containing only ahmad

                          Log.i("Object ",String.valueOf(tempParseObject.getInt("score")));




                      }
                  }
              }
          }
      });
*/
      /*

      final ParseQuery<ParseObject> parseQuery = ParseQuery.getQuery("Score");

     // parseQuery.whereGreaterThan("score",200); we can use thhat to find only objects with score more than 200

      parseQuery.findInBackground(new FindCallback<ParseObject>() {
          @Override
          public void done(List<ParseObject> objects, ParseException e) {

              for(int i = 0 ; i< objects.size();i++)
                 {
                   if(objects.get(i).getInt("score") > 200)
                      {
                        objects.get(i).put("score",(objects.get(i).getInt("score") + 50));
                          //save the object
                          objects.get(i).saveInBackground();
                      }
                 }
          }
      });

      */

                                       // Creating users , SignUp

      /*
      ParseUser user = new ParseUser();
      //You need To set the useername and password  and email(Optional)

      user.setUsername("asami234");
      user.setPassword("Aa001001");

      user.signUpInBackground(new SignUpCallback() {
          @Override
          public void done(ParseException e) {

              if(e == null)
                {
                   Log.i("Signup done ?","Yes");

                }else
                       {
                          Log.i("Signup done ?","No");

                       }

          }
      });

      */

                                    //Loging In


      /*

          //sprecify username and password
          ParseUser.logInInBackground("asami234", "sselsmalm3laykom", new LogInCallback() {
              @Override
              public void done(ParseUser user, ParseException e) {

                   if(e == null)
                      {
                        Log.i("Login Result :","Successfull");
                      }else
                           {
                             Log.i("LogInResult :","Unsuccessfull" + e.toString());
                           }
              }
          });


   */



            ParseUser.logOut();      //Logging out

                           //Test If User is Loged In

           if(ParseUser.getCurrentUser() != null)
              {
                 Log.i("user Loged In",ParseUser.getCurrentUser().getUsername());
              }else
                   {
                       Log.i("user "," Not  logged in ");
                   }


      ParseAnalytics.trackAppOpenedInBackground(getIntent());
  }

}