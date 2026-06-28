.class public Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;
.super Lorg/osmdroid/util/GeoPoint;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field mLabel:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint$a;

    invoke-direct {v0}, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint$a;-><init>()V

    sput-object v0, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(DD)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    return-void
.end method

.method public constructor <init>(DDD)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p6}, Lorg/osmdroid/util/GeoPoint;-><init>(DDD)V

    return-void
.end method

.method public constructor <init>(DDDLjava/lang/String;)V
    .locals 0

    .line 4
    invoke-direct/range {p0 .. p6}, Lorg/osmdroid/util/GeoPoint;-><init>(DDD)V

    .line 5
    iput-object p7, p0, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->mLabel:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(DDLjava/lang/String;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 9
    iput-object p5, p0, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->mLabel:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/location/Location;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lorg/osmdroid/util/GeoPoint;-><init>(Landroid/location/Location;)V

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 7

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v5

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lorg/osmdroid/util/GeoPoint;-><init>(DDD)V

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->setLabel(Ljava/lang/String;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/util/GeoPoint;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lorg/osmdroid/util/GeoPoint;-><init>(Lorg/osmdroid/util/GeoPoint;)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;)V
    .locals 8

    .line 10
    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    move-result-wide v3

    .line 11
    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getAltitude()D

    move-result-wide v5

    invoke-virtual {p1}, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->getLabel()Ljava/lang/String;

    move-result-object v7

    move-object v0, p0

    .line 12
    invoke-direct/range {v0 .. v7}, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;-><init>(DDDLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->clone()Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lorg/osmdroid/util/GeoPoint;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->clone()Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;
    .locals 9

    .line 3
    new-instance v8, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;

    invoke-virtual {p0}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p0}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    move-result-wide v3

    invoke-virtual {p0}, Lorg/osmdroid/util/GeoPoint;->getAltitude()D

    move-result-wide v5

    iget-object v7, p0, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->mLabel:Ljava/lang/String;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;-><init>(DDDLjava/lang/String;)V

    return-object v8
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->mLabel:Ljava/lang/String;

    return-object v0
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->mLabel:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lorg/osmdroid/util/GeoPoint;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lorg/osmdroid/views/overlay/simplefastpoint/LabelledGeoPoint;->mLabel:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method
