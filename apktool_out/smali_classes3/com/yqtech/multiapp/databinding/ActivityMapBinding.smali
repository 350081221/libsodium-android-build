.class public final Lcom/yqtech/multiapp/databinding/ActivityMapBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final btnMock:Lcom/google/android/material/button/MaterialButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final etLat:Landroidx/appcompat/widget/AppCompatEditText;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final etLng:Landroidx/appcompat/widget/AppCompatEditText;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final etSearch:Landroidx/appcompat/widget/AppCompatEditText;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final imageView:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivChangeSearch:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivClear:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivCloseVirtualLocation:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivLatClear:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivLngClear:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivMyLocation:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivSearch:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivSearchLatlng:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final layBottom:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final layFunction:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final laySearch:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final laySearchCity:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final laySearchLatlon:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final main:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final map:Lorg/osmdroid/views/MapView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rvResult:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final toolbar:Lcom/google/android/material/appbar/MaterialToolbar;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvCloseVirtualLocation:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvHistory:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvLatitudeLongitude:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/button/MaterialButton;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/osmdroid/views/MapView;Landroidx/recyclerview/widget/RecyclerView;Lcom/google/android/material/appbar/MaterialToolbar;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 2
    .param p1    # Landroidx/constraintlayout/widget/ConstraintLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/material/button/MaterialButton;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroidx/appcompat/widget/AppCompatEditText;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroidx/appcompat/widget/AppCompatEditText;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroidx/appcompat/widget/AppCompatEditText;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p11    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p12    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p13    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p14    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p15    # Landroidx/constraintlayout/widget/ConstraintLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p16    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p17    # Landroidx/constraintlayout/widget/ConstraintLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p18    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p19    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p20    # Landroidx/constraintlayout/widget/ConstraintLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p21    # Lorg/osmdroid/views/MapView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p22    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p23    # Lcom/google/android/material/appbar/MaterialToolbar;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p24    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p25    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p26    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move-object v0, p0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 2
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object v1, p2

    .line 3
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->btnMock:Lcom/google/android/material/button/MaterialButton;

    move-object v1, p3

    .line 4
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etLat:Landroidx/appcompat/widget/AppCompatEditText;

    move-object v1, p4

    .line 5
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etLng:Landroidx/appcompat/widget/AppCompatEditText;

    move-object v1, p5

    .line 6
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etSearch:Landroidx/appcompat/widget/AppCompatEditText;

    move-object v1, p6

    .line 7
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->imageView:Landroid/widget/ImageView;

    move-object v1, p7

    .line 8
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivChangeSearch:Landroid/widget/ImageView;

    move-object v1, p8

    .line 9
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivClear:Landroid/widget/ImageView;

    move-object v1, p9

    .line 10
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivCloseVirtualLocation:Landroid/widget/ImageView;

    move-object v1, p10

    .line 11
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivLatClear:Landroid/widget/ImageView;

    move-object v1, p11

    .line 12
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivLngClear:Landroid/widget/ImageView;

    move-object v1, p12

    .line 13
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivMyLocation:Landroid/widget/ImageView;

    move-object v1, p13

    .line 14
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivSearch:Landroid/widget/ImageView;

    move-object/from16 v1, p14

    .line 15
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivSearchLatlng:Landroid/widget/ImageView;

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->layBottom:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object/from16 v1, p16

    .line 17
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->layFunction:Landroid/widget/LinearLayout;

    move-object/from16 v1, p17

    .line 18
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->laySearch:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object/from16 v1, p18

    .line 19
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->laySearchCity:Landroid/widget/LinearLayout;

    move-object/from16 v1, p19

    .line 20
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->laySearchLatlon:Landroid/widget/LinearLayout;

    move-object/from16 v1, p20

    .line 21
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->main:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object/from16 v1, p21

    .line 22
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->map:Lorg/osmdroid/views/MapView;

    move-object/from16 v1, p22

    .line 23
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->rvResult:Landroidx/recyclerview/widget/RecyclerView;

    move-object/from16 v1, p23

    .line 24
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    move-object/from16 v1, p24

    .line 25
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->tvCloseVirtualLocation:Landroid/widget/TextView;

    move-object/from16 v1, p25

    .line 26
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->tvHistory:Landroid/widget/TextView;

    move-object/from16 v1, p26

    .line 27
    iput-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->tvLatitudeLongitude:Landroid/widget/TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/yqtech/multiapp/databinding/ActivityMapBinding;
    .locals 30
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const v1, 0x7f0900bc

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v5, v2

    .line 11
    check-cast v5, Lcom/google/android/material/button/MaterialButton;

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    const v1, 0x7f09014f

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v6, v2

    .line 23
    check-cast v6, Landroidx/appcompat/widget/AppCompatEditText;

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    const v1, 0x7f090150

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    move-object v7, v2

    .line 35
    check-cast v7, Landroidx/appcompat/widget/AppCompatEditText;

    .line 36
    .line 37
    if-eqz v7, :cond_0

    .line 38
    .line 39
    const v1, 0x7f090152

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    move-object v8, v2

    .line 47
    check-cast v8, Landroidx/appcompat/widget/AppCompatEditText;

    .line 48
    .line 49
    if-eqz v8, :cond_0

    .line 50
    .line 51
    const v1, 0x7f09018d

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    move-object v9, v2

    .line 59
    check-cast v9, Landroid/widget/ImageView;

    .line 60
    .line 61
    if-eqz v9, :cond_0

    .line 62
    .line 63
    const v1, 0x7f0901b0

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    move-object v10, v2

    .line 71
    check-cast v10, Landroid/widget/ImageView;

    .line 72
    .line 73
    if-eqz v10, :cond_0

    .line 74
    .line 75
    const v1, 0x7f0901b1

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    move-object v11, v2

    .line 83
    check-cast v11, Landroid/widget/ImageView;

    .line 84
    .line 85
    if-eqz v11, :cond_0

    .line 86
    .line 87
    const v1, 0x7f0901b3

    .line 88
    .line 89
    .line 90
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    move-object v12, v2

    .line 95
    check-cast v12, Landroid/widget/ImageView;

    .line 96
    .line 97
    if-eqz v12, :cond_0

    .line 98
    .line 99
    const v1, 0x7f0901b7

    .line 100
    .line 101
    .line 102
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    move-object v13, v2

    .line 107
    check-cast v13, Landroid/widget/ImageView;

    .line 108
    .line 109
    if-eqz v13, :cond_0

    .line 110
    .line 111
    const v1, 0x7f0901c1

    .line 112
    .line 113
    .line 114
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    move-object v14, v2

    .line 119
    check-cast v14, Landroid/widget/ImageView;

    .line 120
    .line 121
    if-eqz v14, :cond_0

    .line 122
    .line 123
    const v1, 0x7f0901c2

    .line 124
    .line 125
    .line 126
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    move-object v15, v2

    .line 131
    check-cast v15, Landroid/widget/ImageView;

    .line 132
    .line 133
    if-eqz v15, :cond_0

    .line 134
    .line 135
    const v1, 0x7f0901c5

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    move-object/from16 v16, v2

    .line 143
    .line 144
    check-cast v16, Landroid/widget/ImageView;

    .line 145
    .line 146
    if-eqz v16, :cond_0

    .line 147
    .line 148
    const v1, 0x7f0901c6

    .line 149
    .line 150
    .line 151
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    move-object/from16 v17, v2

    .line 156
    .line 157
    check-cast v17, Landroid/widget/ImageView;

    .line 158
    .line 159
    if-eqz v17, :cond_0

    .line 160
    .line 161
    const v1, 0x7f0901ce

    .line 162
    .line 163
    .line 164
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    move-object/from16 v18, v2

    .line 169
    .line 170
    check-cast v18, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 171
    .line 172
    if-eqz v18, :cond_0

    .line 173
    .line 174
    const v1, 0x7f0901cf

    .line 175
    .line 176
    .line 177
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    move-object/from16 v19, v2

    .line 182
    .line 183
    check-cast v19, Landroid/widget/LinearLayout;

    .line 184
    .line 185
    if-eqz v19, :cond_0

    .line 186
    .line 187
    const v1, 0x7f0901d1

    .line 188
    .line 189
    .line 190
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    move-object/from16 v20, v2

    .line 195
    .line 196
    check-cast v20, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 197
    .line 198
    if-eqz v20, :cond_0

    .line 199
    .line 200
    const v1, 0x7f0901d2

    .line 201
    .line 202
    .line 203
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    move-object/from16 v21, v2

    .line 208
    .line 209
    check-cast v21, Landroid/widget/LinearLayout;

    .line 210
    .line 211
    if-eqz v21, :cond_0

    .line 212
    .line 213
    const v1, 0x7f0901d3

    .line 214
    .line 215
    .line 216
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    move-object/from16 v22, v2

    .line 221
    .line 222
    check-cast v22, Landroid/widget/LinearLayout;

    .line 223
    .line 224
    if-eqz v22, :cond_0

    .line 225
    .line 226
    move-object/from16 v23, v0

    .line 227
    .line 228
    check-cast v23, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 229
    .line 230
    const v1, 0x7f0901eb

    .line 231
    .line 232
    .line 233
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    move-object/from16 v24, v2

    .line 238
    .line 239
    check-cast v24, Lorg/osmdroid/views/MapView;

    .line 240
    .line 241
    if-eqz v24, :cond_0

    .line 242
    .line 243
    const v1, 0x7f0902c6

    .line 244
    .line 245
    .line 246
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    move-object/from16 v25, v2

    .line 251
    .line 252
    check-cast v25, Landroidx/recyclerview/widget/RecyclerView;

    .line 253
    .line 254
    if-eqz v25, :cond_0

    .line 255
    .line 256
    const v1, 0x7f090348

    .line 257
    .line 258
    .line 259
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    move-object/from16 v26, v2

    .line 264
    .line 265
    check-cast v26, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 266
    .line 267
    if-eqz v26, :cond_0

    .line 268
    .line 269
    const v1, 0x7f09036e

    .line 270
    .line 271
    .line 272
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    move-object/from16 v27, v2

    .line 277
    .line 278
    check-cast v27, Landroid/widget/TextView;

    .line 279
    .line 280
    if-eqz v27, :cond_0

    .line 281
    .line 282
    const v1, 0x7f090376

    .line 283
    .line 284
    .line 285
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    move-object/from16 v28, v2

    .line 290
    .line 291
    check-cast v28, Landroid/widget/TextView;

    .line 292
    .line 293
    if-eqz v28, :cond_0

    .line 294
    .line 295
    const v1, 0x7f090378

    .line 296
    .line 297
    .line 298
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    move-object/from16 v29, v2

    .line 303
    .line 304
    check-cast v29, Landroid/widget/TextView;

    .line 305
    .line 306
    if-eqz v29, :cond_0

    .line 307
    .line 308
    new-instance v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    .line 309
    .line 310
    move-object v3, v0

    .line 311
    move-object/from16 v4, v23

    .line 312
    .line 313
    invoke-direct/range {v3 .. v29}, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/button/MaterialButton;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/osmdroid/views/MapView;Landroidx/recyclerview/widget/RecyclerView;Lcom/google/android/material/appbar/MaterialToolbar;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 314
    .line 315
    .line 316
    return-object v0

    .line 317
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    new-instance v1, Ljava/lang/NullPointerException;

    .line 326
    .line 327
    const-string v2, "Missing required view with ID: "

    .line 328
    .line 329
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw v1
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/yqtech/multiapp/databinding/ActivityMapBinding;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/yqtech/multiapp/databinding/ActivityMapBinding;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const v0, 0x7f0c0024

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->bind(Landroid/view/View;)Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
