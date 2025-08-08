package com.functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User
{
	int uid;
	String uname;
	public User(int uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + "]\n";
	}
}
class NameComparator implements Comparator<User>
{

	@Override
	public int compare(User u1, User u2) {
		
		return u1.uname.compareTo(u2.uname);
	}
	
}
public class ComparatorTest {

	public static void main(String[] args) {
		
		List<User> ulist=Arrays
						.asList(new User(1,"Abhishek"),
								new User(3,"Shanthi"),
								new User(2,"Pratham"));
		
		NameComparator nc=new NameComparator();
		Collections.sort(ulist,nc);	
		System.out.println(ulist);
		
		String str1="Abhishek";
		String str2="Abhilash";
		System.out.println(str1.compareTo(str2));
		
	}
}
