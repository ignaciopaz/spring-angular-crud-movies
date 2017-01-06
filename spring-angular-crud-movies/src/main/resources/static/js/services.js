/**
 * Created by Sandeep on 01/06/14.
 */

angular.module('movieApp.services',[]).factory('Movie',function($resource){
    var Movie = $resource('/movies/:id',{id:'@id'},{
        update: {
            method: 'PUT' //instead of PUT
        },
    	delete: {
	        method: 'DELETE' , //instead of DELETE
	    }
    
    });
    return Movie;
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});