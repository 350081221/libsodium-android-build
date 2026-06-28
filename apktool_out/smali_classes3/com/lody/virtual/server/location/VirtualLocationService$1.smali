.class Lcom/lody/virtual/server/location/VirtualLocationService$1;
.super Lcom/lody/virtual/helper/PersistenceLayer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/location/VirtualLocationService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/server/location/VirtualLocationService;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/location/VirtualLocationService;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService$1;->this$0:Lcom/lody/virtual/server/location/VirtualLocationService;

    invoke-direct {p0, p2}, Lcom/lody/virtual/helper/PersistenceLayer;-><init>(Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public getCurrentVersion()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public readPersistenceData(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    iget-object p2, p0, Lcom/lody/virtual/server/location/VirtualLocationService$1;->this$0:Lcom/lody/virtual/server/location/VirtualLocationService;

    .line 2
    .line 3
    invoke-static {p2}, Lcom/lody/virtual/server/location/VirtualLocationService;->access$000(Lcom/lody/virtual/server/location/VirtualLocationService;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    new-instance v0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;-><init>(Landroid/os/Parcel;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, v0}, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->set(Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lcom/lody/virtual/server/location/VirtualLocationService$1;->this$0:Lcom/lody/virtual/server/location/VirtualLocationService;

    .line 16
    .line 17
    invoke-static {p2}, Lcom/lody/virtual/server/location/VirtualLocationService;->access$100(Lcom/lody/virtual/server/location/VirtualLocationService;)Lcom/lody/virtual/helper/collection/SparseArray;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Lcom/lody/virtual/helper/collection/SparseArray;->clear()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    :goto_0
    add-int/lit8 v0, p2, -0x1

    .line 29
    .line 30
    if-lez p2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v2, p0, Lcom/lody/virtual/server/location/VirtualLocationService$1;->this$0:Lcom/lody/virtual/server/location/VirtualLocationService;

    .line 49
    .line 50
    invoke-static {v2}, Lcom/lody/virtual/server/location/VirtualLocationService;->access$100(Lcom/lody/virtual/server/location/VirtualLocationService;)Lcom/lody/virtual/helper/collection/SparseArray;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2, p2, v1}, Lcom/lody/virtual/helper/collection/SparseArray;->put(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move p2, v0

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-void
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
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
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

.method public writePersistenceData(Landroid/os/Parcel;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$1;->this$0:Lcom/lody/virtual/server/location/VirtualLocationService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/server/location/VirtualLocationService;->access$000(Lcom/lody/virtual/server/location/VirtualLocationService;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, p1, v1}, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->writeToParcel(Landroid/os/Parcel;I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$1;->this$0:Lcom/lody/virtual/server/location/VirtualLocationService;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/lody/virtual/server/location/VirtualLocationService;->access$100(Lcom/lody/virtual/server/location/VirtualLocationService;)Lcom/lody/virtual/helper/collection/SparseArray;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$1;->this$0:Lcom/lody/virtual/server/location/VirtualLocationService;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/lody/virtual/server/location/VirtualLocationService;->access$100(Lcom/lody/virtual/server/location/VirtualLocationService;)Lcom/lody/virtual/helper/collection/SparseArray;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-ge v1, v0, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService$1;->this$0:Lcom/lody/virtual/server/location/VirtualLocationService;

    .line 37
    .line 38
    invoke-static {v0}, Lcom/lody/virtual/server/location/VirtualLocationService;->access$100(Lcom/lody/virtual/server/location/VirtualLocationService;)Lcom/lody/virtual/helper/collection/SparseArray;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, v1}, Lcom/lody/virtual/helper/collection/SparseArray;->keyAt(I)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, Lcom/lody/virtual/server/location/VirtualLocationService$1;->this$0:Lcom/lody/virtual/server/location/VirtualLocationService;

    .line 47
    .line 48
    invoke-static {v2}, Lcom/lody/virtual/server/location/VirtualLocationService;->access$100(Lcom/lody/virtual/server/location/VirtualLocationService;)Lcom/lody/virtual/helper/collection/SparseArray;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2, v1}, Lcom/lody/virtual/helper/collection/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/util/Map;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    return-void
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
.end method
