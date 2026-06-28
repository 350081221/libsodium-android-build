.class Lcom/lody/virtual/remote/VParceledListSlice$2;
.super Landroid/os/Binder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/remote/VParceledListSlice;->writeToParcel(Landroid/os/Parcel;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/remote/VParceledListSlice;

.field final synthetic val$N:I

.field final synthetic val$callFlags:I

.field final synthetic val$listElementClass:Ljava/lang/Class;


# direct methods
.method constructor <init>(Lcom/lody/virtual/remote/VParceledListSlice;ILjava/lang/Class;I)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/remote/VParceledListSlice$2;->this$0:Lcom/lody/virtual/remote/VParceledListSlice;

    iput p2, p0, Lcom/lody/virtual/remote/VParceledListSlice$2;->val$N:I

    iput-object p3, p0, Lcom/lody/virtual/remote/VParceledListSlice$2;->val$listElementClass:Ljava/lang/Class;

    iput p4, p0, Lcom/lody/virtual/remote/VParceledListSlice$2;->val$callFlags:I

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method protected onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {}, Lcom/lody/virtual/remote/VParceledListSlice;->access$100()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const-string p4, " of "

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-static {}, Lcom/lody/virtual/remote/VParceledListSlice;->access$200()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "Writing more @"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget v2, p0, Lcom/lody/virtual/remote/VParceledListSlice$2;->val$N:I

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {p2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_0
    iget p2, p0, Lcom/lody/virtual/remote/VParceledListSlice$2;->val$N:I

    .line 54
    .line 55
    if-ge p1, p2, :cond_3

    .line 56
    .line 57
    invoke-virtual {p3}, Landroid/os/Parcel;->dataSize()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/high16 v1, 0x40000

    .line 62
    .line 63
    if-ge p2, v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 66
    .line 67
    .line 68
    iget-object p2, p0, Lcom/lody/virtual/remote/VParceledListSlice$2;->this$0:Lcom/lody/virtual/remote/VParceledListSlice;

    .line 69
    .line 70
    invoke-static {p2}, Lcom/lody/virtual/remote/VParceledListSlice;->access$300(Lcom/lody/virtual/remote/VParceledListSlice;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    check-cast p2, Landroid/os/Parcelable;

    .line 79
    .line 80
    iget-object v1, p0, Lcom/lody/virtual/remote/VParceledListSlice$2;->val$listElementClass:Ljava/lang/Class;

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v1, v2}, Lcom/lody/virtual/remote/VParceledListSlice;->access$400(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 87
    .line 88
    .line 89
    iget v1, p0, Lcom/lody/virtual/remote/VParceledListSlice$2;->val$callFlags:I

    .line 90
    .line 91
    invoke-virtual {p3, p2, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lcom/lody/virtual/remote/VParceledListSlice;->access$100()Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-eqz p2, :cond_2

    .line 99
    .line 100
    invoke-static {}, Lcom/lody/virtual/remote/VParceledListSlice;->access$200()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v2, "Wrote extra #"

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v2, ": "

    .line 118
    .line 119
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    iget-object v2, p0, Lcom/lody/virtual/remote/VParceledListSlice$2;->this$0:Lcom/lody/virtual/remote/VParceledListSlice;

    .line 123
    .line 124
    invoke-static {v2}, Lcom/lody/virtual/remote/VParceledListSlice;->access$300(Lcom/lody/virtual/remote/VParceledListSlice;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {p2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_3
    iget p2, p0, Lcom/lody/virtual/remote/VParceledListSlice$2;->val$N:I

    .line 146
    .line 147
    if-ge p1, p2, :cond_5

    .line 148
    .line 149
    invoke-static {}, Lcom/lody/virtual/remote/VParceledListSlice;->access$100()Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-eqz p2, :cond_4

    .line 154
    .line 155
    invoke-static {}, Lcom/lody/virtual/remote/VParceledListSlice;->access$200()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    new-instance v1, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    const-string v2, "Breaking @"

    .line 165
    .line 166
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    iget p1, p0, Lcom/lody/virtual/remote/VParceledListSlice$2;->val$N:I

    .line 176
    .line 177
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    :cond_4
    const/4 p1, 0x0

    .line 188
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 189
    .line 190
    .line 191
    :cond_5
    return v0
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method
