package com.pages;

public class pageobjecrmanager {
private	loginpage loginpage;
private paymentpage paymentpage;
private searchHotel searchHotel;
private selectHotel selectHotel;

public loginpage getLoginpage() {
	return (loginpage==null)?loginpage=new loginpage():loginpage;
}
public paymentpage getPaymentpage() {
	return (paymentpage==null)?paymentpage=new paymentpage():paymentpage;
}
public searchHotel getSearchHotel() {
	return (searchHotel==null)?searchHotel=new searchHotel():searchHotel;
}
public selectHotel getSelectHotel() {
	return (selectHotel==null)?selectHotel=new selectHotel():selectHotel;
}



}
