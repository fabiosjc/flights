angular
    .module('app')
    .controller('FlightsController', function($scope, $http) {

      function init(){
        $scope.flights = []
      }

      $http.get('http://localhost:8080/api/flights')
        .then(
          function(response){
            $scope.flights = response.data
          },
          function(err) {
            console.error('Erro ao consultar os vôos', err)
        })

       init()
    });


