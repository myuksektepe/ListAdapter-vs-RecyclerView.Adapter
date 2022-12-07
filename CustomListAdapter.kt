class CustomListAdapter : ListAdapter<CustomModel, CustomViewHolder>(CustomDiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(createBinding(parent))
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}


object CustomDiffCallback : DiffUtil.ItemCallback<CustomModel>() {
    override fun areItemsTheSame(oldItem: CustomModel, newItem: CustomModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: CustomModel, newItem: CustomModel): Boolean {
        return oldItem == newItem
    }
}

private fun createBinding(parent: ViewGroup) = CustomLayoutItemBinding.inflate(
    LayoutInflater.from(parent.context),
    parent,
    false
)
