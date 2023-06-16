package com.dillu.quran

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SurahRecyclerViewAdapter(
    private val context : Context,
    private val surahNo : Int,
    private val verses: List<Verses>,
    private val versesTransliteration: List<Verses>) :  RecyclerView.Adapter<SurahRecyclerViewAdapter.ItemViewHolder>()
        {

        class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
            val verseText : TextView = view.findViewById(R.id.verse_text)
            val verseNumber:TextView = view.findViewById(R.id.verse_number)
            val verseTextTransliteration: TextView = view.findViewById(R.id.verse_text_transliteration)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.surah_page_verses_implementation, parent, false)
            return ItemViewHolder(adapterLayout)
        }

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val verse = verses[position]
            holder.verseText.text = context.resources.getString(verse.stringResourceId)
            val vno = (surahNo+1).toString() + ":" + (position+1)
            holder.verseNumber.text = vno
            val verseTransliteration = versesTransliteration[position]
            holder.verseTextTransliteration.text = context.resources.getString(verseTransliteration.stringResourceId)

        }

        override fun getItemCount() = verses.size


}
