class CustomViewHolder(private val binding: CustomLayoutItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: CustomModel) {
        binding.txtName.text = item.name
        binding.txtAge.text = item.age.toString()
    }
}
