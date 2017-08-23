angular
  .module('app')
  .service('flightsService', function($resource) {
      var service = {
        findAll: findAll
      }

      function findAll() {
        // TODO implementar usando $resource / $http
        return [{ number: 'FLY1111' }, { number: 'FLY222' }]
      }

      return service
});
