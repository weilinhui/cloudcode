<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page contentType="text/html;charset=utf-8"%>
<title>sunflower</title>
<link href="static/file/login.css" rel="stylesheet" type="text/css">
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
<script src="static/file/login.js"></script>
</head>

<body class="login" mycollectionplug="bind">
<div class="login_m">
<div class="login_logo"><img src="/static/file/logo.png" width="46" height="46"></div>
<div class="login_boder">

<div class="login_padding" id="login_model">

  <h2>USERNAME</h2>
      <label>
        <input type="text" name="fUserPhone" class="txt_input txt_input2" onfocus="if (value ==&#39;Your name&#39;){value =&#39;&#39;}" onblur="if (value ==&#39;&#39;){value=&#39;Your name&#39;}" value="Your name">
      </label>
      <h2>PASSWORD</h2>
      <label>
        <input type="password" name="fUserPassword" class="txt_input" onfocus="if (value ==&#39;******&#39;){value =&#39;&#39;}" onblur="if (value ==&#39;&#39;){value=&#39;******&#39;}" value="******">
      </label>


  <p class="forgot" >
      <span class="error_text"></span>
      <a id="iforget" href="javascript:void(0);" style="float: right">Forgot your password?</a>
  </p>
  <div class="rem_sub">
  <div class="rem_sub_l">
  <input type="checkbox" name="checkbox" id="save_me">
       <label for="checkbox">Remember me</label>
       </div>
        <label>
          <input type="submit" class="sub_button" name="button" id="button" value="SIGN-IN" style="opacity: 0.7;">
        </label>
      </div>
</div>
</div>
</div>
 <br> <br>
<p align="center"> More thing </p>

</body></html>