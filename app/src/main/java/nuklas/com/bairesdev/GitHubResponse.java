package nuklas.com.bairesdev;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GitHubResponse {

    @SerializedName("items")
    public ArrayList<GitHubRepo> repoList;

    public class GitHubRepo {
        @SerializedName("full_name")
        public String name;
    }
}
