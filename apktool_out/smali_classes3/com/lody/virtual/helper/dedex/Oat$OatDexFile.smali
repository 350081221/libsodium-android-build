.class public Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Oat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OatDexFile"
.end annotation


# instance fields
.field class_offsets_offset_:I

.field final dex_file_location_checksum_:I

.field public final dex_file_location_data_:[B

.field public final dex_file_location_size_:I

.field final dex_file_offset_:I

.field dex_file_pointer_:Ljava/io/File;

.field lookup_table_offset_:I


# direct methods
.method public constructor <init>(Lcom/lody/virtual/helper/dedex/DataReader;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;->dex_file_location_size_:I

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;->dex_file_location_data_:[B

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([B)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;->dex_file_location_checksum_:I

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;->dex_file_offset_:I

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->getFile()Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "vdex"

    .line 34
    .line 35
    invoke-static {v1, v2}, Lcom/lody/virtual/helper/utils/FileUtils;->changeExt(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    iput-object v1, p0, Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;->dex_file_pointer_:Ljava/io/File;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/16 v2, 0x1c

    .line 49
    .line 50
    if-eq v0, v2, :cond_2

    .line 51
    .line 52
    :goto_0
    sget-object v0, Lcom/lody/virtual/helper/dedex/Oat$Version;->N_70:Lcom/lody/virtual/helper/dedex/Oat$Version;

    .line 53
    .line 54
    iget v0, v0, Lcom/lody/virtual/helper/dedex/Oat$Version;->oat:I

    .line 55
    .line 56
    if-lt p2, v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    iput p2, p0, Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;->class_offsets_offset_:I

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iput p1, p0, Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;->lookup_table_offset_:I

    .line 69
    .line 70
    :cond_1
    return-void

    .line 71
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 72
    .line 73
    new-instance p2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v2, "dex_file_offset_="

    .line 79
    .line 80
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v0, ", does "

    .line 87
    .line 88
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v0, " miss?"

    .line 99
    .line 100
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method


# virtual methods
.method public getLocation()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;->dex_file_location_data_:[B

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    return-object v0
.end method
