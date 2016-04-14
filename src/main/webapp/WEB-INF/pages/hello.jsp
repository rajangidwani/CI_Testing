<html ng-app="myApp">
<head>
	Login Page
</head>
<body ng-controller="LoginController">
<input type="text" ng-model="username" placeholder="Enter Username"/>
<input type="password" ng-model="password" placeholder="Enter Password"/>
<input type="button" ng-click="authenticate()" value="Sign In">
</body>


<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>

<script>
	var app = angular.module('myApp', []);
	app.controller("LoginController", function($scope,$http) {
		$scope.authenticate = function() {
			$http.get('http://localhost:8080/SampleForJenkins/login', { headers: {username:$scope.username, password:$scope.password} }).success(
					function(response){ $scope.result = response;
						console.log($scope.result);
						alert($scope.result);
					}).error(
					function(failure) { console.log("failed :(", failure);
						console.log(failure);
						alert(failure);
					});
		}
	});
</script>

</html>