angular
    .module('app')
    .directive('flightsList', flightsList)

    function flightsList() {
        return {
            scope: {
              flights: '='
            },
            controller: 'FlightsController',
            templateUrl: 'js/directives/flights/flights-list.html',
            bindToController: true,
            controllerAs: 'vm'
        }
    }