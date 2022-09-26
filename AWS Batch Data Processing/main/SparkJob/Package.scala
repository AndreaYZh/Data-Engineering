package SparkJob

object Domain {
    case class SparkParams(
        // CsvParser
        parser: String = "",
        // Csv, Json, Avro
        inFormat: String = "",
        // parquet, csv, avro
        outFormat: String = "",
        inPath: String = "",
        // s3://wcd-data-engineer-batch/output/
        outPath: String = "",
        // append, overwrite 
        saveMode:String = "",
        partitionColumn: String = "",
        inOptions: Map[String, String] = Map.empty[String, String],
        outOptions: Map[String, String] = Map.empty[String, String]
    )
}
