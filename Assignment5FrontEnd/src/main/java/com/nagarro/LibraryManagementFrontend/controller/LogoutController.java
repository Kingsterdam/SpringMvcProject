package com.nagarro.LibraryManagementFrontend.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This Logout Controller class handle all logout request for a web
 * applications.
 *
 */
@Controller
public class LogoutController {

	/**
	 * this method logout user from current session.

	 */
	@RequestMapping("logout")
	public String logout(HttpSession session) {

		session.setAttribute("user", null);
		session.setAttribute("username", null);
		return "login";
	}

}
