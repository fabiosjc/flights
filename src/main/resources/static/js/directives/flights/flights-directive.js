angular
    .module('app')
    .directive('flightsList', flightsList)

    function flightsList() {
        return {
            controller: 'FlightsController',
            templateUrl: 'js/directives/flights/flights-list.html'
        }
    }