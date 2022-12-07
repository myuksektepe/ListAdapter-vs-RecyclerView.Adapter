class CustomRecyclerViewAdapter : RecyclerView.Adapter<CustomViewHolder>() {

    private var list = emptyList<CustomModel>()

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(createBinding(parent))
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun submitListWithDiffUtil(newList: List<CustomModel>) {
        val diffUtil = CustomDiffUtil(list, newList)
        val diffResults = DiffUtil.calculateDiff(diffUtil)
        list = newList
        diffResults.dispatchUpdatesTo(this)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(newList: List<CustomModel>){
        list = newList
        notifyDataSetChanged()
    }

}

private fun createBinding(parent: ViewGroup) = CustomLayoutItemBinding.inflate(
    LayoutInflater.from(parent.context),
    parent,
    false
)
