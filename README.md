# 

# Room Database Demo
 

## Summary
- **Summary:**  Android Room Database Demo 
- **Created Date:** 22 July 2023
- **Last modified:** 22 July 2023 

## Feature
- List of Notes
- Clear Notes
- Add note by clicking Floating Action Button
- Take Input Note Title, Description & Priority & Save
- Refresh List



### Technology Used
- Kotlin
- Room Database
- RecyclerView
- Card View
- Floating Action Button
- Constraint Layout
- Number Input 

### Backend Details

- **Webservice** : offline


#### Example Model


```
{
       
        "title": "title",
        "description": "Lorem ipsum description",
        "priority": 4
    }

```

```
@Entity(tableName = "note_table")
data class Note(val title: String?,
                val description: String?,
                val priority: Int,
                @PrimaryKey(autoGenerate = false) val id: Int? = null)
```

- **Library Imports**
  
```


    def lifecycle_version = "2.1.0"
    def room_version = "2.4.2"

    implementation 'androidx.cardview:cardview:1.0.0'
    implementation 'com.google.android.material:material:1.2.0-alpha03'
    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'

    // ViewModel and LiveData
   implementation "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"
   kapt "androidx.lifecycle:lifecycle-common-java8:$lifecycle_version"

    implementation "androidx.room:room-runtime:$room_version"
    implementation "androidx.room:room-ktx:$room_version"
    kapt "androidx.room:room-compiler:$room_version"
```

- **build.gradle (app)**
```
plugins {
    ...
    id 'kotlin-kapt'
}
```



#### Project Structure



<img src="https://github.com/ganeshroman/Room_Database_Demo/blob/9e07f40b83de087c3c6440a36aefdfd3854eef22/Screenshot%202023-07-23%20at%2012.20.16%20AM.png" width="250" height="450">


#### Screenshots


<img src="https://github.com/ganeshroman/Room_Database_Demo/blob/9e07f40b83de087c3c6440a36aefdfd3854eef22/Screenshot_20230723_000952.png" width="250" height="450">

<img src="https://github.com/ganeshroman/Room_Database_Demo/blob/9e07f40b83de087c3c6440a36aefdfd3854eef22/Screenshot_20230723_001100.png" width="250" height="450">

<img src="https://github.com/ganeshroman/Room_Database_Demo/blob/9e07f40b83de087c3c6440a36aefdfd3854eef22/Screenshot_20230723_001122.png" width="250" height="450">












