angular
    .module('app')
    .controller('FlightsController', function($scope, $http) {

      function init(){
        $scope.flights = []
        $scope.flight = {}
        loadFlights()
      }

      // TODO passar lógica para um service e testar
      function loadFlights() {
        $http.get('http://localhost:8080/api/flights')
          .then(
            function(response){
              $scope.flights = response.data
            },
            function(err) {
              console.error('Erro ao consultar os vôos', err)
        })
      }

      $scope.showDetails = function(id) {
          $http.get('http://localhost:8080/api/flights/'+id)
            .then(
              function(response){
                $scope.flight = response.data
              },
              function(err) {
                console.error('Erro ao consultar o vôo', err)
          })
      }

       init()
    });


