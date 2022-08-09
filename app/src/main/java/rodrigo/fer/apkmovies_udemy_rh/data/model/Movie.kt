package rodrigo.fer.apkmovies_udemy_rh.data.model

class Movie {

    //    el -1 indica que el valor del id es vacio
    val id: Int = -1
    //    @SerializedName("adult") transforma el nombre del atributo para la busqueda en el servidor
    val adult: Boolean = false
    // val genre_ids: List<Int> = listOf()) -> Creacion de una lista vacia
    val genre_ids: List<Int> = listOf()
    val backdrop_path: String = ""
    val original_title: String = ""
    val original_language: String = ""
    val overview: String = ""
    val popularity: Double = -1.0
    val poster_path: String = ""
    val release_date: String = ""
    val title: String = ""
    val video: Boolean = false
    val vote_average: Double = -1.0
    val vote_count: Int = -1


}