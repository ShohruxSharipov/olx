package com.example.olx

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.olx.Categories.Categories
import com.example.olx.Categories.Item
import com.example.olx.adapter.Adapter2
import com.example.olx.adapter.AdapterCl
import com.example.olx.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: Item? = null
//    private var param2: String? = null
    var advertisement = mutableListOf<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
                param1 = it.getSerializable(ARG_PARAM1) as Item
//            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater,container,false)
        var list = mutableListOf<Categories>()
        list.add(Categories(R.drawable.olx,"Barcha Ruknlar"))
        list.add(Categories(R.drawable.key,"Ko'chmas mulk"))
        list.add(Categories(R.drawable.car,"Transport"))
        list.add(Categories(R.drawable.pet,"Hayvonlar"))
        binding.RV.layoutManager = LinearLayoutManager(requireContext(), HORIZONTAL,false)
        binding.RV2.layoutManager = GridLayoutManager(requireContext(),2)
        var adapter = AdapterCl(list)
        var adapter2 = Adapter2(add(),object : Adapter2.OnClick{
            override fun setOnClick(item: Item, position: Int) {
                val fr = Purchase()
                val bundle = bundleOf()
                bundle.putString("item",item.Price)
                fr.arguments = bundle
                parentFragmentManager.beginTransaction().replace(R.id.main,Purchase())
                    .addToBackStack("Home")
                    .commit()
                Log.d("TAG", "setOnClick: ${bundle.toString()}")
            }

        })
        binding.RV.adapter = adapter
        binding.RV2.adapter = adapter2
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: Item) =
            Home().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
                }
            }
    }
    fun add():MutableList<Item>{
        advertisement.add(Item(R.drawable.img,"Malibu yangi takoy","90 000$",""))
        advertisement.add(Item(R.drawable.img,"3 ta qo'y","1 000$",""))
        advertisement.add(Item(R.drawable.img,"iPhone 7 ishlatilmagan","300$",""))
        advertisement.add(Item(R.drawable.img,"Velik","200$",""))
        advertisement.add(Item(R.drawable.img,"Furniture","500$",""))
        advertisement.add(Item(R.drawable.img,"Uy","150 000$",""))
        advertisement.add(Item(R.drawable.img,"Patinka","90$",""))
        advertisement.add(Item(R.drawable.img,"Krasovka","23$",""))
        advertisement.add(Item(R.drawable.img,"Mushuk","tekin",""))
        advertisement.add(Item(R.drawable.img,"KAMAZ","110 000$",""))
        advertisement.add(Item(R.drawable.img,"Malibu yangi takoy","90 000$",""))
        advertisement.add(Item(R.drawable.img,"3 ta qo'y","1 000$",""))
        advertisement.add(Item(R.drawable.img,"iPhone 7 ishlatilmagan","300$",""))
        advertisement.add(Item(R.drawable.img,"Velik","200$",""))
        advertisement.add(Item(R.drawable.img,"Furniture","500$",""))
        advertisement.add(Item(R.drawable.img,"Uy","150 000$",""))
        advertisement.add(Item(R.drawable.img,"Patinka","90$",""))
        advertisement.add(Item(R.drawable.img,"Krasovka","23$",""))
        advertisement.add(Item(R.drawable.img,"Mushuk","tekin",""))
        advertisement.add(Item(R.drawable.img,"KAMAZ","110 000$",""))
        advertisement.add(Item(R.drawable.img,"Malibu yangi takoy","90 000$",""))
        advertisement.add(Item(R.drawable.img,"3 ta qo'y","1 000$",""))
        advertisement.add(Item(R.drawable.img,"iPhone 7 ishlatilmagan","300$",""))
        advertisement.add(Item(R.drawable.img,"Velik","200$",""))
        advertisement.add(Item(R.drawable.img,"Furniture","500$",""))
        advertisement.add(Item(R.drawable.img,"Uy","150 000$",""))
        advertisement.add(Item(R.drawable.img,"Patinka","90$",""))
        advertisement.add(Item(R.drawable.img,"Krasovka","23$",""))
        advertisement.add(Item(R.drawable.img,"Mushuk","tekin",""))
        advertisement.add(Item(R.drawable.img,"KAMAZ","110 000$",""))
        return advertisement
    }
}