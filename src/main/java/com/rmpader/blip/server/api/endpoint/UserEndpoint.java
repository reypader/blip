package com.rmpader.blip.server.api.endpoint;

import com.rmpader.blip.server.api.resource.*;

/**
 * Created by rpader on 2/29/16.
 */
public class UserEndpoint {

    public void register(InitialRegistrationRequest request){

    }

    public void verify(String registrationCode){

    }

    public UserProfileResponse getProfile(String userId){
        return null;
    }

    public void updateProfile(ProfileUpdateRequest request){

    }

    public ListUsersResponse findUser(String startsWith){
        return null;
    }

    public ListFriendRequestsResponse getFriendRequests(){
        return null;
    }

    public void addFriend(String userId){

    }

    public void confirmFriend(String userId){

    }

}
