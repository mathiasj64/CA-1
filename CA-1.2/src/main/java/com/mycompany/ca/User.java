/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca;

import java.net.Socket;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static com.mycompany.ca.TCPServer.ss;

/**
 *
 * @author Mathias
 */
public class User extends Thread
{

  String username;

  public User(String username)
  {
    this.username = username;
  }


  public void run()
  {
    
  }
}
