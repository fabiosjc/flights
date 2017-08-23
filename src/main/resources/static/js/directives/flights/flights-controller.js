angular
    .module('app')
    .controller('FlightsController', function($scope, $http){
        $scope.flights = [
            {
                number: 'FLY1111'
            },
            {
                number: 'FLY222'
            }
        ]
    });


