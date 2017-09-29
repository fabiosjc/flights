angular
    .module('app')
    .controller('FlightsController', function($http) {
      var URL = 'http://flights-challenge.herokuapp.com'
      var vm = this

      function init() {
        vm.flights = []
        vm.flight = undefined
        loadFlights()
      }

      // TODO passar lógica para um service e testar
      function loadFlights() {
        $http.get(`${URL}/api/flights`).then(
          function(response){
            vm.flights = response.data
          },
          function(err) {
            console.error('Erro ao consultar os vôos', err)
        })
      }

      vm.showDetails = function(id) {
          $http.get(`${URL}/api/flights/${id}`)
            .then(
              function(response){
                vm.flight = response.data
              },
              function(err) {
                console.error('Erro ao consultar o vôo', err)
          })
      }

       init()
    });


