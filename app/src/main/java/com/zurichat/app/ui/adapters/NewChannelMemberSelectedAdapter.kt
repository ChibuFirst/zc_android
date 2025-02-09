package com.zurichat.app.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.zurichat.app.databinding.ItemSelectedMembersBinding
import com.zurichat.app.models.OrganizationMember


class NewChannelMemberSelectedAdapter(
    private val memberDataList: List<OrganizationMember>,
) : RecyclerView.Adapter<NewChannelMemberSelectedAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
           ItemSelectedMembersBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(memberDataList[position])
    }

    override fun getItemCount(): Int = memberDataList.size

    inner class ViewHolder(private var binding: ItemSelectedMembersBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(memberData: OrganizationMember) {
            binding.textView16.text = memberData.userName

        }
    }
}
