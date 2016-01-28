<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

    <title>Test</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">

    <style type="text/css">
        * {
            margin: 0px;
            padding: 0px;
        }

        ul {
            list-style: none;
        }

        li {
            clear: both;
        }

        .list_button {
            text-decoration: none;
        }

        .left {
            float: left;
            width: 3px;
            height: 23px;
            background: url("./images/left.png") left center no-repeat;
        }

        .right {
            float: left;
            width: 3px;
            height: 23px;
            background: url("./images/right.png") left center no-repeat;
        }

        .middle {
            float: left;
            height: 23px;
            background: url("./images/middle.png") repeat-x;
        }
    </style>

</head>
<body>

<body background="http://www.thestatebankgroup.com/sites/default/files/mobile-bkgr.jpg">
 <ul>
        <li>
            <a href="#" class="list_button">
                <div class="left"></div>
                <div class="middle">First</div>
                <div class="right"></div>
            </a>
        </li>
        <li>
            <a href="#" class="list_button">
                <div class="left"></div>
                <div class="middle">Second</div>
                <div class="right"></div>
            </a>
        </li>
    </ul>
</body>
</html>