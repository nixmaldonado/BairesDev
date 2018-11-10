package nuklas.com.bairesdev;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GitHubService {

    @GET("search/repositories?q=android+language:kotlin&sort=stars&order=desc")
    Call<GitHubResponse> getRepos();
}
