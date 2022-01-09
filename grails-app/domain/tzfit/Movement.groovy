package tzfit

class Movement {

    String title
    String description
    String videoResource

    static hasMany = [sheetsDisplayedOn: Sheet]

    static mapping = {
        sheetsDisplayedOn joinTable: [name: "sheet_movements", key: 'movement_id']
    }

    static constraints = {
        title(maxSize: 255, blank: false, unique: true)
        videoResource(nullable: true)
        description(nullable: true)
    }

    String toString(){
        title
    }
}
