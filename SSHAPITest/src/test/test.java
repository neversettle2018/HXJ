package test;

import java.util.List;

import testdao.DaoBusiness;
import testentity.Users;

public class test {
	public static void main(String[] args) {
		List<Users> users=   new DaoBusiness().getAllTrousers();
		System.out.println(users);
	}
}
