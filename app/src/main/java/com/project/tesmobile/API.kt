package com.project.tesmobile
class API {
    companion object {
        fun buatSetData(): ArrayList<ListObjKM> {
            val list = ArrayList<ListObjKM>()
            //list bisa didapatkan/copas di web pcr ya. https://pcr.ac.id/prodi/301/teknik-informatika/profil
            list.add(
                ListObjKM(
                    "Ananda.",
                    "Digital ",
                    "https://pcr.ac.id/assets/images/pegawai/AND20170207022257.jpg",
                    "10851",

                )
            )


            list.add(
                ListObjKM(
                    "Silvana",
                    "Rasio",
                    "https://pcr.ac.id/assets/images/pegawai/SRH20190718105457.jpg",
                    "silvana@gmail.com",
                )
            )
            list.add(
                ListObjKM(
                    "Agus ",
                    "Urip",
                    "https://pcr.ac.id/assets/images/pegawai/AUA20190718114257.jpg",
                    "urip@gmail.com",
                )
            )


            return list
        }
    }
}
