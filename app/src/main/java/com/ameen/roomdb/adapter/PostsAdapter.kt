package com.ameen.roomdb.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.ameen.roomdb.Post
import com.ameen.roomdb.R
import com.ameen.roomdb.adapter.PostsAdapter.PostsViewHolder
import java.util.*

class PostsAdapter(private var postsList: ArrayList<Post>) :
    RecyclerView.Adapter<PostsViewHolder>() {

    //private var postsList = ArrayList<Post>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        return PostsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        holder.titleText.text = postsList[position].title
        holder.bodyText.text = postsList[position].body
    }

    override fun getItemCount(): Int = postsList.size

    fun setList(postsList: ArrayList<Post>) {
        this.postsList = postsList
        notifyDataSetChanged()
    }


    class PostsViewHolder(itemView: View) : ViewHolder(itemView) {
        val titleText: TextView
        val bodyText: TextView

        init {
            titleText = itemView.findViewById(R.id.titleTextView)
            bodyText = itemView.findViewById(R.id.bodyTextView)
        }
    }
}