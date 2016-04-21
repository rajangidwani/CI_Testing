<%--
  Created by IntelliJ IDEA.
  User: rgidwani
  Date: 15-04-2016
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="myApp">
<head>
    <title></title>
</head>
<body>
  <p><a href = "#signin">Sign In</a></p>
  <p><a href = "#signup">Sign Up</a></p>
  <div ng-view></div>
</body>

  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>

  <script>
    var app = angular.module('myApp', []);

    app.config(['$routeProvider', function($routeProvider) {
      $routeProvider.

              when('/signin', {
                templateUrl: 'signin.html'
              }).

              when('/signup', {
                templateUrl: 'signup.html'
              }).

              otherwise({
                redirectTo: '/'
              });

    }]);

  </script>

</html>
