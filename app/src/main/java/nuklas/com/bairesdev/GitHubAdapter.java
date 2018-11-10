package nuklas.com.bairesdev;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import nuklas.com.bairesdev.GitHubResponse.GitHubRepo;

import java.util.ArrayList;

public class GitHubAdapter extends RecyclerView.Adapter<GitHubAdapter.GitHubViewHolder> {

    private ArrayList<GitHubRepo> reposList;

    public GitHubAdapter(ArrayList<GitHubRepo> reposList){
        this.reposList = reposList;
    }

    @NonNull
    @Override
    public GitHubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.repo_name, parent, false);
        return new GitHubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GitHubViewHolder holder, int position) {
        holder.repoNameTextView.setText(reposList.get(position).name);
    }

    @Override
    public int getItemCount() {
        return reposList.size();
    }

    class GitHubViewHolder extends RecyclerView.ViewHolder {
        TextView repoNameTextView;

            GitHubViewHolder(View itemView) {
            super(itemView);
            repoNameTextView = itemView.findViewById(R.id.repo_name);
        }
    }
}
