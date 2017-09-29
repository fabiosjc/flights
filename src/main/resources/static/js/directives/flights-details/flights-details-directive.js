angular
    .module('app')
    .directive('flightsDetails', flightsDetails)

    function flightsDetails() {
        return {
            scope: {
              flight: '='
            },
            controller: 'FlightsDetailsController',
            templateUrl: 'js/directives/flights-details/flights-details.html',
            bindToController: true,
            controllerAs: 'vm'
        }
    }