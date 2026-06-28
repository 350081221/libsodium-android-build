.class public final Lcom/yuanqi/master/location/MapActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"

# interfaces
.implements Lcom/yuanqi/master/tools/z0;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingPermission"
    }
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002J\u0008\u00106\u001a\u000203H\u0002J\u0008\u00107\u001a\u000203H\u0002J\u0008\u00108\u001a\u000203H\u0002J\u0008\u00109\u001a\u000203H\u0002J\u0008\u0010:\u001a\u000203H\u0002J\u0012\u0010;\u001a\u0002032\u0008\u0010<\u001a\u0004\u0018\u00010=H\u0014J\u001a\u0010>\u001a\u0002032\u0008\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020\u0008H\u0016J\u0008\u0010B\u001a\u000203H\u0014J\u0008\u0010C\u001a\u000203H\u0014J,\u0010D\u001a\u0002032\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002030JH\u0002J\u0008\u0010K\u001a\u000203H\u0002J\u0008\u0010L\u001a\u000203H\u0002J\u0008\u0010M\u001a\u000203H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008$\u0010%R\u000e\u0010(\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00148B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008/\u00100\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R\u000e\u00101\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006N"
    }
    d2 = {
        "Lcom/yuanqi/master/location/MapActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "Lcom/yuanqi/master/tools/OnItemClickListener;",
        "()V",
        "CHANGE_MAP_ZOOM",
        "",
        "DEFAULT_ZOOM",
        "HISTORY_RESULT_CODE",
        "",
        "PARSE_SUCCESS_CODE",
        "TAG",
        "",
        "address",
        "addressesLiveData",
        "Landroidx/lifecycle/MutableLiveData;",
        "Lcom/yuanqi/master/network/model/CustomAddress;",
        "appName",
        "binding",
        "Lcom/yqtech/multiapp/databinding/ActivityMapBinding;",
        "isLocation",
        "",
        "isShowList",
        "locationListener",
        "Landroid/location/LocationListener;",
        "locationManager",
        "Landroid/location/LocationManager;",
        "mAdapter",
        "Lcom/yuanqi/master/location/AddressAdapter;",
        "mList",
        "",
        "mLocation",
        "Lcom/lody/virtual/remote/vloc/VLocation;",
        "mMarker",
        "Lorg/osmdroid/views/overlay/Marker;",
        "mapViewModel",
        "Lcom/yuanqi/master/location/MapViewModel;",
        "getMapViewModel",
        "()Lcom/yuanqi/master/location/MapViewModel;",
        "mapViewModel$delegate",
        "Lkotlin/Lazy;",
        "packageName",
        "<set-?>",
        "showMapTipKey",
        "getShowMapTipKey",
        "()Z",
        "setShowMapTipKey",
        "(Z)V",
        "showMapTipKey$delegate",
        "Lcom/yuanqi/master/tools/MVFast;",
        "userId",
        "changeMapCenter",
        "",
        "geoPoint",
        "Lorg/osmdroid/util/GeoPoint;",
        "finishResult",
        "hideKeyboard",
        "initMap",
        "initObservers",
        "initView",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onItemClick",
        "view",
        "Landroid/view/View;",
        "position",
        "onPause",
        "onResume",
        "setEditListener",
        "et",
        "Landroidx/appcompat/widget/AppCompatEditText;",
        "ivClear",
        "Landroid/widget/ImageView;",
        "action",
        "Lkotlin/Function1;",
        "showMapTipDialog",
        "startLocation",
        "stopLocation",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nMapActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapActivity.kt\ncom/yuanqi/master/location/MapActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,531:1\n75#2,13:532\n*S KotlinDebug\n*F\n+ 1 MapActivity.kt\ncom/yuanqi/master/location/MapActivity\n*L\n66#1:532,13\n*E\n"
    }
.end annotation


# static fields
.field static final synthetic v:[Lkotlin/reflect/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/o<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:I


# instance fields
.field private final a:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

.field private final c:Lkotlin/d0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private d:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/yuanqi/master/network/model/CustomAddress;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private e:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private f:Lcom/yuanqi/master/location/AddressAdapter;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yuanqi/master/network/model/CustomAddress;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private h:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private i:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private j:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private k:I

.field private l:Lcom/lody/virtual/remote/vloc/VLocation;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private m:Lorg/osmdroid/views/overlay/Marker;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final n:F

.field private final o:F

.field private final p:I

.field private final q:I

.field private r:Landroid/location/LocationManager;

.field private s:Z

.field private final t:Lcom/yuanqi/master/tools/x0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final u:Landroid/location/LocationListener;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Lkotlin/reflect/o;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/x0;

    .line 5
    .line 6
    const-string v2, "showMapTipKey"

    .line 7
    .line 8
    const-string v3, "getShowMapTipKey()Z"

    .line 9
    .line 10
    const-class v4, Lcom/yuanqi/master/location/MapActivity;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/x0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/l1;->k(Lkotlin/jvm/internal/w0;)Lkotlin/reflect/l;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    aput-object v1, v0, v5

    .line 21
    .line 22
    sput-object v0, Lcom/yuanqi/master/location/MapActivity;->v:[Lkotlin/reflect/o;

    .line 23
    .line 24
    const/16 v0, 0x8

    .line 25
    .line 26
    sput v0, Lcom/yuanqi/master/location/MapActivity;->w:I

    .line 27
    .line 28
    return-void
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
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "MapActivity"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->a:Ljava/lang/String;

    .line 7
    .line 8
    sget-object v0, Lcom/yuanqi/master/location/MapActivity$j;->INSTANCE:Lcom/yuanqi/master/location/MapActivity$j;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/yuanqi/master/location/MapActivity$m;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/yuanqi/master/location/MapActivity$m;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 18
    .line 19
    const-class v2, Lcom/yuanqi/master/location/MapViewModel;

    .line 20
    .line 21
    invoke-static {v2}, Lkotlin/jvm/internal/l1;->d(Ljava/lang/Class;)Lkotlin/reflect/d;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Lcom/yuanqi/master/location/MapActivity$n;

    .line 26
    .line 27
    invoke-direct {v3, p0}, Lcom/yuanqi/master/location/MapActivity$n;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 28
    .line 29
    .line 30
    new-instance v4, Lcom/yuanqi/master/location/MapActivity$o;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-direct {v4, v5, p0}, Lcom/yuanqi/master/location/MapActivity$o;-><init>(Lv3/a;Landroidx/activity/ComponentActivity;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, Lcom/yuanqi/master/location/MapActivity;->c:Lkotlin/d0;

    .line 40
    .line 41
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 42
    .line 43
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->d:Landroidx/lifecycle/MutableLiveData;

    .line 47
    .line 48
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->e:Landroidx/lifecycle/MutableLiveData;

    .line 54
    .line 55
    new-instance v0, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->g:Ljava/util/List;

    .line 61
    .line 62
    const-string v0, ""

    .line 63
    .line 64
    iput-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->h:Ljava/lang/String;

    .line 65
    .line 66
    iput-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->i:Ljava/lang/String;

    .line 67
    .line 68
    iput-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->j:Ljava/lang/String;

    .line 69
    .line 70
    const/4 v0, -0x1

    .line 71
    iput v0, p0, Lcom/yuanqi/master/location/MapActivity;->k:I

    .line 72
    .line 73
    const/high16 v0, 0x41000000    # 8.0f

    .line 74
    .line 75
    iput v0, p0, Lcom/yuanqi/master/location/MapActivity;->n:F

    .line 76
    .line 77
    const/high16 v0, 0x41800000    # 16.0f

    .line 78
    .line 79
    iput v0, p0, Lcom/yuanqi/master/location/MapActivity;->o:F

    .line 80
    .line 81
    const/16 v0, 0x171

    .line 82
    .line 83
    iput v0, p0, Lcom/yuanqi/master/location/MapActivity;->p:I

    .line 84
    .line 85
    const/16 v0, 0x3e8

    .line 86
    .line 87
    iput v0, p0, Lcom/yuanqi/master/location/MapActivity;->q:I

    .line 88
    .line 89
    new-instance v0, Lcom/yuanqi/master/tools/x0;

    .line 90
    .line 91
    const-string v1, "showMapTipDialog"

    .line 92
    .line 93
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-direct {v0, v1, v2}, Lcom/yuanqi/master/tools/x0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->t:Lcom/yuanqi/master/tools/x0;

    .line 99
    .line 100
    new-instance v0, Lcom/yuanqi/master/location/i;

    .line 101
    .line 102
    invoke-direct {v0, p0}, Lcom/yuanqi/master/location/i;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->u:Landroid/location/LocationListener;

    .line 106
    .line 107
    return-void
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method public static synthetic C(Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/yuanqi/master/location/MapActivity;->h0(Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic D(Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/location/MapActivity;->m0(Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic E(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/yuanqi/master/location/MapActivity;->f0(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic F(Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/location/MapActivity;->n0(Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic G(Lcom/yuanqi/master/tools/dialog/b;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/location/MapActivity;->u0(Lcom/yuanqi/master/tools/dialog/b;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic H(Lcom/yuanqi/master/location/MapActivity;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/location/MapActivity;->v0(Lcom/yuanqi/master/location/MapActivity;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic I(Lcom/yuanqi/master/location/MapActivity;Landroid/location/Location;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/location/MapActivity;->p0(Lcom/yuanqi/master/location/MapActivity;Landroid/location/Location;)V

    return-void
.end method

.method public static synthetic J(Lcom/yuanqi/master/tools/dialog/b;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/location/MapActivity;->t0(Lcom/yuanqi/master/tools/dialog/b;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic K(Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/location/MapActivity;->l0(Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic L(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/yuanqi/master/location/MapActivity;->g0(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic M(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/yuanqi/master/location/MapActivity;->j0(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic N(Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/location/MapActivity;->k0(Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/yuanqi/master/location/MapActivity;->o0(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic P(Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/location/MapActivity;->i0(Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic Q(Lcom/yuanqi/master/location/MapActivity;Lorg/osmdroid/util/GeoPoint;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/yuanqi/master/location/MapActivity;->X(Lorg/osmdroid/util/GeoPoint;)V

    return-void
.end method

.method public static final synthetic R(Lcom/yuanqi/master/location/MapActivity;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/location/MapActivity;->d:Landroidx/lifecycle/MutableLiveData;

    return-object p0
.end method

.method public static final synthetic S(Lcom/yuanqi/master/location/MapActivity;)Lcom/yqtech/multiapp/databinding/ActivityMapBinding;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/location/MapActivity;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    return-object p0
.end method

.method public static final synthetic T(Lcom/yuanqi/master/location/MapActivity;)Lcom/yuanqi/master/location/AddressAdapter;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/location/MapActivity;->f:Lcom/yuanqi/master/location/AddressAdapter;

    return-object p0
.end method

.method public static final synthetic U(Lcom/yuanqi/master/location/MapActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/location/MapActivity;->g:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic V(Lcom/yuanqi/master/location/MapActivity;)Lcom/yuanqi/master/location/MapViewModel;
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->Z()Lcom/yuanqi/master/location/MapViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic W(Lcom/yuanqi/master/location/MapActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/location/MapActivity;->a:Ljava/lang/String;

    return-object p0
.end method

.method private final X(Lorg/osmdroid/util/GeoPoint;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "binding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->tvLatitudeLongitude:Landroid/widget/TextView;

    .line 13
    .line 14
    new-instance v3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v4, "\u7eac\u5ea6\uff1a"

    .line 20
    .line 21
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v4, " , \u7ecf\u5ea6\uff1a"

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    .line 51
    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    invoke-static {v2}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v0, v1

    .line 58
    :cond_1
    iget-object v0, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->map:Lorg/osmdroid/views/MapView;

    .line 59
    .line 60
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getRepository()Lorg/osmdroid/views/MapViewRepository;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-eqz v3, :cond_4

    .line 65
    .line 66
    iget-object v3, p0, Lcom/yuanqi/master/location/MapActivity;->m:Lorg/osmdroid/views/overlay/Marker;

    .line 67
    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    iget-object v3, p0, Lcom/yuanqi/master/location/MapActivity;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    .line 71
    .line 72
    if-nez v3, :cond_2

    .line 73
    .line 74
    invoke-static {v2}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move-object v1, v3

    .line 79
    :goto_0
    iget-object v1, v1, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->map:Lorg/osmdroid/views/MapView;

    .line 80
    .line 81
    invoke-virtual {v1}, Lorg/osmdroid/views/MapView;->getOverlays()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-object v2, p0, Lcom/yuanqi/master/location/MapActivity;->m:Lorg/osmdroid/views/overlay/Marker;

    .line 86
    .line 87
    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_3
    new-instance v1, Lorg/osmdroid/views/overlay/Marker;

    .line 91
    .line 92
    invoke-direct {v1, v0}, Lorg/osmdroid/views/overlay/Marker;-><init>(Lorg/osmdroid/views/MapView;)V

    .line 93
    .line 94
    .line 95
    const-string v2, "\u5f53\u524d\u4f4d\u7f6e"

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Lorg/osmdroid/views/overlay/OverlayWithIW;->setTitle(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, p1}, Lorg/osmdroid/views/overlay/Marker;->setPosition(Lorg/osmdroid/util/GeoPoint;)V

    .line 101
    .line 102
    .line 103
    const v2, 0x7f0800b3

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v2}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v1, v2}, Lorg/osmdroid/views/overlay/Marker;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 111
    .line 112
    .line 113
    iput-object v1, p0, Lcom/yuanqi/master/location/MapActivity;->m:Lorg/osmdroid/views/overlay/Marker;

    .line 114
    .line 115
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getOverlays()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iget-object v2, p0, Lcom/yuanqi/master/location/MapActivity;->m:Lorg/osmdroid/views/overlay/Marker;

    .line 120
    .line 121
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    :cond_4
    iget-object v1, p0, Lcom/yuanqi/master/location/MapActivity;->l:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 125
    .line 126
    if-nez v1, :cond_5

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    iput-wide v2, v1, Lcom/lody/virtual/remote/vloc/VLocation;->latitude:D

    .line 134
    .line 135
    :goto_1
    iget-object v1, p0, Lcom/yuanqi/master/location/MapActivity;->l:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 136
    .line 137
    if-nez v1, :cond_6

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_6
    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 141
    .line 142
    .line 143
    move-result-wide v2

    .line 144
    iput-wide v2, v1, Lcom/lody/virtual/remote/vloc/VLocation;->longitude:D

    .line 145
    .line 146
    :goto_2
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const-wide/high16 v1, 0x402c000000000000L    # 14.0

    .line 151
    .line 152
    invoke-interface {v0, v1, v2}, Lorg/osmdroid/api/IMapController;->setZoom(D)D

    .line 153
    .line 154
    .line 155
    invoke-interface {v0, p1}, Lorg/osmdroid/api/IMapController;->setCenter(Lorg/osmdroid/api/IGeoPoint;)V

    .line 156
    .line 157
    .line 158
    return-void
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
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

.method private final Y()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/yuanqi/master/location/MapActivity;->i:Ljava/lang/String;

    .line 6
    .line 7
    iget v2, p0, Lcom/yuanqi/master/location/MapActivity;->k:I

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/lody/virtual/client/core/VirtualCore;->killApp(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->get()Lcom/lody/virtual/client/ipc/VirtualLocationManager;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p0, Lcom/yuanqi/master/location/MapActivity;->k:I

    .line 17
    .line 18
    iget-object v2, p0, Lcom/yuanqi/master/location/MapActivity;->i:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    invoke-virtual {v0, v1, v2, v3}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->setMode(ILjava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->get()Lcom/lody/virtual/client/ipc/VirtualLocationManager;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v1, p0, Lcom/yuanqi/master/location/MapActivity;->k:I

    .line 29
    .line 30
    iget-object v2, p0, Lcom/yuanqi/master/location/MapActivity;->i:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v3, p0, Lcom/yuanqi/master/location/MapActivity;->l:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2, v3}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->setLocation(ILjava/lang/String;Lcom/lody/virtual/remote/vloc/VLocation;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Landroid/content/Intent;

    .line 38
    .line 39
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v1, "virtual_location"

    .line 43
    .line 44
    iget-object v2, p0, Lcom/yuanqi/master/location/MapActivity;->l:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    const-string v1, "virtual.extras.package"

    .line 50
    .line 51
    iget-object v2, p0, Lcom/yuanqi/master/location/MapActivity;->i:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    const-string v1, "virtual.extras.userid"

    .line 57
    .line 58
    iget v2, p0, Lcom/yuanqi/master/location/MapActivity;->k:I

    .line 59
    .line 60
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 61
    .line 62
    .line 63
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 64
    .line 65
    const/4 v1, -0x1

    .line 66
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 70
    .line 71
    .line 72
    return-void
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
.end method

.method private final Z()Lcom/yuanqi/master/location/MapViewModel;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->c:Lkotlin/d0;

    invoke-interface {v0}, Lkotlin/d0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yuanqi/master/location/MapViewModel;

    return-object v0
.end method

.method private final a0()Z
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->t:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/location/MapActivity;->v:[Lkotlin/reflect/o;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/yuanqi/master/tools/x0;->getValue(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final b0()V
    .locals 4

    .line 1
    const-string v0, "input_method"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/yuanqi/master/location/MapActivity;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    const-string v1, "binding"

    .line 20
    .line 21
    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    move-object v1, v2

    .line 25
    :cond_0
    iget-object v1, v1, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etSearch:Landroidx/appcompat/widget/AppCompatEditText;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual {v0, v1, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :cond_1
    const/4 v1, 0x0

    .line 42
    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 43
    .line 44
    .line 45
    return-void
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
.end method

.method private final c0()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    .line 2
    .line 3
    const-string v1, "binding"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v2

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->map:Lorg/osmdroid/views/MapView;

    .line 13
    .line 14
    sget-object v3, Lcom/yuanqi/master/tools/u0;->b:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Lorg/osmdroid/views/MapView;->setTileSource(Lorg/osmdroid/tileprovider/tilesource/e;)V

    .line 17
    .line 18
    .line 19
    const-wide/high16 v3, 0x4008000000000000L    # 3.0

    .line 20
    .line 21
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v0, v3}, Lorg/osmdroid/views/MapView;->setMinZoomLevel(Ljava/lang/Double;)V

    .line 26
    .line 27
    .line 28
    const-wide/high16 v3, 0x4032000000000000L    # 18.0

    .line 29
    .line 30
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v0, v3}, Lorg/osmdroid/views/MapView;->setMaxZoomLevel(Ljava/lang/Double;)V

    .line 35
    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-virtual {v0, v3}, Lorg/osmdroid/views/MapView;->setTilesScaledToDpi(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v3}, Lorg/osmdroid/views/MapView;->setBuiltInZoomControls(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-wide/high16 v5, 0x4026000000000000L    # 11.0

    .line 49
    .line 50
    invoke-interface {v4, v5, v6}, Lorg/osmdroid/api/IMapController;->setZoom(D)D

    .line 51
    .line 52
    .line 53
    new-instance v5, Lorg/osmdroid/util/GeoPoint;

    .line 54
    .line 55
    const-wide v6, 0x4045f33333333333L    # 43.9

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    const-wide v8, 0x405f551eb851eb85L    # 125.33

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-direct {v5, v6, v7, v8, v9}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v4, v5}, Lorg/osmdroid/api/IMapController;->setCenter(Lorg/osmdroid/api/IGeoPoint;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getZoomController()Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    sget-object v5, Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;->NEVER:Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;

    .line 76
    .line 77
    invoke-virtual {v4, v5}, Lorg/osmdroid/views/CustomZoomButtonsController;->setVisibility(Lorg/osmdroid/views/CustomZoomButtonsController$Visibility;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v3}, Lorg/osmdroid/views/MapView;->setMultiTouchControls(Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-interface {v4}, Lorg/osmdroid/views/overlay/OverlayManager;->getTilesOverlay()Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4, v3}, Lorg/osmdroid/views/overlay/Overlay;->setEnabled(Z)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v3}, Landroid/view/View;->setSelected(Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getOverlayManager()Lorg/osmdroid/views/overlay/OverlayManager;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    new-instance v3, Lcom/yuanqi/master/location/MapActivity$a;

    .line 102
    .line 103
    invoke-direct {v3, p0}, Lcom/yuanqi/master/location/MapActivity$a;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const-string v3, "virtual_location"

    .line 114
    .line 115
    invoke-virtual {v0, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_1

    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Lcom/lody/virtual/remote/vloc/VLocation;

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_1
    move-object v0, v2

    .line 133
    :goto_0
    if-eqz v0, :cond_5

    .line 134
    .line 135
    iput-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->l:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 136
    .line 137
    new-instance v3, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    const-string v4, "\u865a\u62df\u4f4d\u7f6e\uff1a"

    .line 143
    .line 144
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v4, " \uff0c packageName\uff1a"

    .line 151
    .line 152
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    iget-object v4, p0, Lcom/yuanqi/master/location/MapActivity;->i:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    const/4 v4, 0x0

    .line 165
    new-array v5, v4, [Ljava/lang/Object;

    .line 166
    .line 167
    invoke-static {v3, v5}, Lcom/orhanobut/logger/j;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-static {}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->get()Lcom/lody/virtual/client/ipc/VirtualLocationManager;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    iget v5, p0, Lcom/yuanqi/master/location/MapActivity;->k:I

    .line 175
    .line 176
    iget-object v6, p0, Lcom/yuanqi/master/location/MapActivity;->i:Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {v3, v5, v6}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->isUseVirtualLocation(ILjava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-eqz v3, :cond_4

    .line 183
    .line 184
    iget-object v3, p0, Lcom/yuanqi/master/location/MapActivity;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    .line 185
    .line 186
    if-nez v3, :cond_2

    .line 187
    .line 188
    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    move-object v3, v2

    .line 192
    :cond_2
    iget-object v3, v3, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivCloseVirtualLocation:Landroid/widget/ImageView;

    .line 193
    .line 194
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 195
    .line 196
    .line 197
    iget-object v3, p0, Lcom/yuanqi/master/location/MapActivity;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    .line 198
    .line 199
    if-nez v3, :cond_3

    .line 200
    .line 201
    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_3
    move-object v2, v3

    .line 206
    :goto_1
    iget-object v1, v2, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->tvCloseVirtualLocation:Landroid/widget/TextView;

    .line 207
    .line 208
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 209
    .line 210
    .line 211
    new-instance v1, Lorg/osmdroid/util/GeoPoint;

    .line 212
    .line 213
    invoke-virtual {v0}, Lcom/lody/virtual/remote/vloc/VLocation;->getLatitude()D

    .line 214
    .line 215
    .line 216
    move-result-wide v2

    .line 217
    invoke-virtual {v0}, Lcom/lody/virtual/remote/vloc/VLocation;->getLongitude()D

    .line 218
    .line 219
    .line 220
    move-result-wide v4

    .line 221
    invoke-direct {v1, v2, v3, v4, v5}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 222
    .line 223
    .line 224
    invoke-direct {p0, v1}, Lcom/yuanqi/master/location/MapActivity;->X(Lorg/osmdroid/util/GeoPoint;)V

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_4
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->a:Ljava/lang/String;

    .line 229
    .line 230
    const-string v1, "\u672a\u4f7f\u7528\u865a\u62df\u4f4d\u7f6e"

    .line 231
    .line 232
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->w0()V

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_5
    new-instance v0, Lcom/lody/virtual/remote/vloc/VLocation;

    .line 240
    .line 241
    invoke-direct {v0}, Lcom/lody/virtual/remote/vloc/VLocation;-><init>()V

    .line 242
    .line 243
    .line 244
    iput-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->l:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 245
    .line 246
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->a:Ljava/lang/String;

    .line 247
    .line 248
    const-string v1, "\u865a\u62df\u4f4d\u7f6e\u4e3anull"

    .line 249
    .line 250
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->w0()V

    .line 254
    .line 255
    .line 256
    :goto_2
    return-void
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method private final d0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    new-instance v1, Lcom/yuanqi/master/location/MapActivity$b;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/yuanqi/master/location/MapActivity$b;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lcom/yuanqi/master/location/MapActivity$k;

    .line 9
    .line 10
    invoke-direct {v2, v1}, Lcom/yuanqi/master/location/MapActivity$k;-><init>(Lv3/l;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->e:Landroidx/lifecycle/MutableLiveData;

    .line 17
    .line 18
    new-instance v1, Lcom/yuanqi/master/location/MapActivity$c;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lcom/yuanqi/master/location/MapActivity$c;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lcom/yuanqi/master/location/MapActivity$k;

    .line 24
    .line 25
    invoke-direct {v2, v1}, Lcom/yuanqi/master/location/MapActivity$k;-><init>(Lv3/l;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->Z()Lcom/yuanqi/master/location/MapViewModel;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lcom/yuanqi/master/location/MapViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Lcom/yuanqi/master/location/MapActivity$d;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Lcom/yuanqi/master/location/MapActivity$d;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Lcom/yuanqi/master/location/MapActivity$k;

    .line 45
    .line 46
    invoke-direct {v2, v1}, Lcom/yuanqi/master/location/MapActivity$k;-><init>(Lv3/l;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->Z()Lcom/yuanqi/master/location/MapViewModel;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lcom/yuanqi/master/location/MapViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Lcom/yuanqi/master/location/MapActivity$e;

    .line 61
    .line 62
    invoke-direct {v1, p0}, Lcom/yuanqi/master/location/MapActivity$e;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    .line 63
    .line 64
    .line 65
    new-instance v2, Lcom/yuanqi/master/location/MapActivity$k;

    .line 66
    .line 67
    invoke-direct {v2, v1}, Lcom/yuanqi/master/location/MapActivity$k;-><init>(Lv3/l;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 71
    .line 72
    .line 73
    return-void
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
.end method

.method private final e0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "binding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->rvResult:Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 19
    .line 20
    new-instance v2, Lcom/yuanqi/master/location/j;

    .line 21
    .line 22
    invoke-direct {v2, p0}, Lcom/yuanqi/master/location/j;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->tvHistory:Landroid/widget/TextView;

    .line 29
    .line 30
    new-instance v2, Lcom/yuanqi/master/location/k;

    .line 31
    .line 32
    invoke-direct {v2, p0}, Lcom/yuanqi/master/location/k;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/yuanqi/master/location/MapActivity;->f:Lcom/yuanqi/master/location/AddressAdapter;

    .line 39
    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    new-instance v1, Lcom/yuanqi/master/location/AddressAdapter;

    .line 43
    .line 44
    iget-object v2, p0, Lcom/yuanqi/master/location/MapActivity;->g:Ljava/util/List;

    .line 45
    .line 46
    invoke-direct {v1, v2}, Lcom/yuanqi/master/location/AddressAdapter;-><init>(Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p0}, Lcom/yuanqi/master/location/AddressAdapter;->e(Lcom/yuanqi/master/tools/z0;)V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lcom/yuanqi/master/location/MapActivity;->f:Lcom/yuanqi/master/location/AddressAdapter;

    .line 53
    .line 54
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->rvResult:Landroidx/recyclerview/widget/RecyclerView;

    .line 55
    .line 56
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v3, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator"

    .line 61
    .line 62
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    check-cast v2, Landroidx/recyclerview/widget/SimpleItemAnimator;

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/SimpleItemAnimator;->setSupportsChangeAnimations(Z)V

    .line 69
    .line 70
    .line 71
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 72
    .line 73
    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 77
    .line 78
    .line 79
    iget-object v2, p0, Lcom/yuanqi/master/location/MapActivity;->f:Lcom/yuanqi/master/location/AddressAdapter;

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etSearch:Landroidx/appcompat/widget/AppCompatEditText;

    .line 85
    .line 86
    const-string v2, "etSearch"

    .line 87
    .line 88
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object v2, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivClear:Landroid/widget/ImageView;

    .line 92
    .line 93
    const-string v3, "ivClear"

    .line 94
    .line 95
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    new-instance v3, Lcom/yuanqi/master/location/MapActivity$g;

    .line 99
    .line 100
    invoke-direct {v3, p0}, Lcom/yuanqi/master/location/MapActivity$g;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    .line 101
    .line 102
    .line 103
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/master/location/MapActivity;->q0(Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Lv3/l;)V

    .line 104
    .line 105
    .line 106
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etLat:Landroidx/appcompat/widget/AppCompatEditText;

    .line 107
    .line 108
    const-string v2, "etLat"

    .line 109
    .line 110
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object v2, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivLatClear:Landroid/widget/ImageView;

    .line 114
    .line 115
    const-string v3, "ivLatClear"

    .line 116
    .line 117
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    sget-object v3, Lcom/yuanqi/master/location/MapActivity$h;->INSTANCE:Lcom/yuanqi/master/location/MapActivity$h;

    .line 121
    .line 122
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/master/location/MapActivity;->q0(Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Lv3/l;)V

    .line 123
    .line 124
    .line 125
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etLng:Landroidx/appcompat/widget/AppCompatEditText;

    .line 126
    .line 127
    const-string v2, "etLng"

    .line 128
    .line 129
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v2, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivLngClear:Landroid/widget/ImageView;

    .line 133
    .line 134
    const-string v3, "ivLngClear"

    .line 135
    .line 136
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    sget-object v3, Lcom/yuanqi/master/location/MapActivity$i;->INSTANCE:Lcom/yuanqi/master/location/MapActivity$i;

    .line 140
    .line 141
    invoke-direct {p0, v1, v2, v3}, Lcom/yuanqi/master/location/MapActivity;->q0(Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Lv3/l;)V

    .line 142
    .line 143
    .line 144
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivClear:Landroid/widget/ImageView;

    .line 145
    .line 146
    new-instance v2, Lcom/yuanqi/master/location/l;

    .line 147
    .line 148
    invoke-direct {v2, p0, v0}, Lcom/yuanqi/master/location/l;-><init>(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    .line 153
    .line 154
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivLatClear:Landroid/widget/ImageView;

    .line 155
    .line 156
    new-instance v2, Lcom/yuanqi/master/location/m;

    .line 157
    .line 158
    invoke-direct {v2, p0, v0}, Lcom/yuanqi/master/location/m;-><init>(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    .line 163
    .line 164
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivLngClear:Landroid/widget/ImageView;

    .line 165
    .line 166
    new-instance v2, Lcom/yuanqi/master/location/n;

    .line 167
    .line 168
    invoke-direct {v2, p0, v0}, Lcom/yuanqi/master/location/n;-><init>(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    .line 173
    .line 174
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivSearchLatlng:Landroid/widget/ImageView;

    .line 175
    .line 176
    new-instance v2, Lcom/yuanqi/master/location/o;

    .line 177
    .line 178
    invoke-direct {v2, v0, p0}, Lcom/yuanqi/master/location/o;-><init>(Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Lcom/yuanqi/master/location/MapActivity;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 182
    .line 183
    .line 184
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivChangeSearch:Landroid/widget/ImageView;

    .line 185
    .line 186
    new-instance v2, Lcom/yuanqi/master/location/c;

    .line 187
    .line 188
    invoke-direct {v2, v0}, Lcom/yuanqi/master/location/c;-><init>(Lcom/yqtech/multiapp/databinding/ActivityMapBinding;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    .line 193
    .line 194
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivCloseVirtualLocation:Landroid/widget/ImageView;

    .line 195
    .line 196
    new-instance v2, Lcom/yuanqi/master/location/d;

    .line 197
    .line 198
    invoke-direct {v2, p0, v0}, Lcom/yuanqi/master/location/d;-><init>(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    .line 203
    .line 204
    iget-object v1, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivMyLocation:Landroid/widget/ImageView;

    .line 205
    .line 206
    new-instance v2, Lcom/yuanqi/master/location/e;

    .line 207
    .line 208
    invoke-direct {v2, p0}, Lcom/yuanqi/master/location/e;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 212
    .line 213
    .line 214
    iget-object v0, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->btnMock:Lcom/google/android/material/button/MaterialButton;

    .line 215
    .line 216
    new-instance v1, Lcom/yuanqi/master/location/f;

    .line 217
    .line 218
    invoke-direct {v1, p0}, Lcom/yuanqi/master/location/f;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 222
    .line 223
    .line 224
    return-void
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method private static final f0(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V
    .locals 1

    .line 1
    const-string p2, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$this_apply"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/yuanqi/master/location/MapActivity;->e:Landroidx/lifecycle/MutableLiveData;

    .line 12
    .line 13
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p1, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etLat:Landroidx/appcompat/widget/AppCompatEditText;

    .line 19
    .line 20
    const-string v0, ""

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p1, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etLat:Landroidx/appcompat/widget/AppCompatEditText;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->b0()V

    .line 31
    .line 32
    .line 33
    return-void
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
    .line 89
    .line 90
.end method

.method private static final g0(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V
    .locals 1

    .line 1
    const-string p2, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$this_apply"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/yuanqi/master/location/MapActivity;->e:Landroidx/lifecycle/MutableLiveData;

    .line 12
    .line 13
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p1, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etLng:Landroidx/appcompat/widget/AppCompatEditText;

    .line 19
    .line 20
    const-string v0, ""

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p1, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etLng:Landroidx/appcompat/widget/AppCompatEditText;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->b0()V

    .line 31
    .line 32
    .line 33
    return-void
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
    .line 89
    .line 90
.end method

.method private static final h0(Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V
    .locals 7

    .line 1
    const-string p2, "$this_apply"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "this$0"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etLat:Landroidx/appcompat/widget/AppCompatEditText;

    .line 12
    .line 13
    invoke-virtual {p2}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    move v0, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v2

    .line 32
    :goto_0
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x2

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    const-string p0, "\u8bf7\u8f93\u5165\u7eac\u5ea6"

    .line 37
    .line 38
    invoke-static {p0, v2, v4, v3}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-static {p2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    invoke-static {v5, v6}, Lcom/yuanqi/master/tools/f1;->o(D)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    const-string p0, "\u8bf7\u8f93\u5165\u6b63\u786e\u7684\u7eac\u5ea6"

    .line 53
    .line 54
    invoke-static {p0, v2, v4, v3}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    iget-object p0, p0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etLng:Landroidx/appcompat/widget/AppCompatEditText;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move v1, v2

    .line 76
    :goto_1
    if-eqz v1, :cond_4

    .line 77
    .line 78
    const-string p0, "\u8bf7\u8f93\u5165\u7ecf\u5ea6"

    .line 79
    .line 80
    invoke-static {p0, v2, v4, v3}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 85
    .line 86
    .line 87
    move-result-wide v0

    .line 88
    invoke-static {v0, v1}, Lcom/yuanqi/master/tools/f1;->p(D)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_5

    .line 93
    .line 94
    const-string p0, "\u8bf7\u8f93\u5165\u6b63\u786e\u7684\u7ecf\u5ea6"

    .line 95
    .line 96
    invoke-static {p0, v2, v4, v3}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_5
    invoke-direct {p1}, Lcom/yuanqi/master/location/MapActivity;->Z()Lcom/yuanqi/master/location/MapViewModel;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-instance v1, Lcom/yuanqi/master/location/MapActivity$f;

    .line 105
    .line 106
    invoke-direct {v1, p1}, Lcom/yuanqi/master/location/MapActivity$f;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p2, p0, v1}, Lcom/yuanqi/master/location/MapViewModel;->g(Ljava/lang/String;Ljava/lang/String;Lv3/l;)V

    .line 110
    .line 111
    .line 112
    return-void
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
.end method

.method private static final i0(Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V
    .locals 3

    .line 1
    const-string p1, "$this_apply"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->laySearchCity:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v0, 0x0

    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    const-string v2, ""

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->laySearchCity:Landroid/widget/LinearLayout;

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->laySearchLatlon:Landroid/widget/LinearLayout;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etSearch:Landroidx/appcompat/widget/AppCompatEditText;

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object p1, p0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->laySearchLatlon:Landroid/widget/LinearLayout;

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->laySearchCity:Landroid/widget/LinearLayout;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etLat:Landroidx/appcompat/widget/AppCompatEditText;

    .line 46
    .line 47
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etLng:Landroidx/appcompat/widget/AppCompatEditText;

    .line 51
    .line 52
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-void
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

.method private static final j0(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V
    .locals 3

    .line 1
    const-string p2, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$this_apply"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p2, 0x2

    .line 12
    const/4 v0, 0x0

    .line 13
    const-string v1, "\u4f4d\u7f6e\u4fdd\u62a4\u5df2\u5173\u95ed"

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {v1, v2, p2, v0}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->i:Ljava/lang/String;

    .line 24
    .line 25
    iget v1, p0, Lcom/yuanqi/master/location/MapActivity;->k:I

    .line 26
    .line 27
    invoke-virtual {p2, v0, v1}, Lcom/lody/virtual/client/core/VirtualCore;->killApp(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->get()Lcom/lody/virtual/client/ipc/VirtualLocationManager;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iget v0, p0, Lcom/yuanqi/master/location/MapActivity;->k:I

    .line 35
    .line 36
    iget-object v1, p0, Lcom/yuanqi/master/location/MapActivity;->i:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p2, v0, v1, v2}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->setMode(ILjava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->get()Lcom/lody/virtual/client/ipc/VirtualLocationManager;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iget v0, p0, Lcom/yuanqi/master/location/MapActivity;->k:I

    .line 46
    .line 47
    iget-object v1, p0, Lcom/yuanqi/master/location/MapActivity;->i:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v2, p0, Lcom/yuanqi/master/location/MapActivity;->l:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 50
    .line 51
    invoke-virtual {p2, v0, v1, v2}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->setLocation(ILjava/lang/String;Lcom/lody/virtual/remote/vloc/VLocation;)V

    .line 52
    .line 53
    .line 54
    iget-object p2, p1, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->ivCloseVirtualLocation:Landroid/widget/ImageView;

    .line 55
    .line 56
    const/16 v0, 0x8

    .line 57
    .line 58
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p1, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->tvCloseVirtualLocation:Landroid/widget/TextView;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 67
    .line 68
    .line 69
    return-void
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
.end method

.method private static final k0(Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V
    .locals 3

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    const/4 v0, 0x0

    .line 8
    const-string v1, "\u6b63\u5728\u5b9a\u4f4d\u5f53\u524d\u4f4d\u7f6e..."

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v1, v2, p1, v0}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->w0()V

    .line 15
    .line 16
    .line 17
    return-void
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
.end method

.method private static final l0(Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "this$0"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lcom/yuanqi/master/location/MapActivity;->m:Lorg/osmdroid/views/overlay/Marker;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u4e00\u4e2a\u4f4d\u7f6e"

    .line 16
    .line 17
    invoke-static {v0, v4, v3, v2}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/yuanqi/master/location/MapActivity;->Z()Lcom/yuanqi/master/location/MapViewModel;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v15, Lv2/c;

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    iget-object v7, v0, Lcom/yuanqi/master/location/MapActivity;->h:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v8, v0, Lcom/yuanqi/master/location/MapActivity;->i:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v9, v0, Lcom/yuanqi/master/location/MapActivity;->j:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v5, v0, Lcom/yuanqi/master/location/MapActivity;->l:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 35
    .line 36
    const-wide/16 v10, 0x0

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    iget-wide v12, v5, Lcom/lody/virtual/remote/vloc/VLocation;->latitude:D

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-wide v12, v10

    .line 44
    :goto_0
    if-eqz v5, :cond_2

    .line 45
    .line 46
    iget-wide v10, v5, Lcom/lody/virtual/remote/vloc/VLocation;->longitude:D

    .line 47
    .line 48
    :cond_2
    move-wide/from16 v16, v10

    .line 49
    .line 50
    new-instance v14, Ljava/util/Date;

    .line 51
    .line 52
    invoke-direct {v14}, Ljava/util/Date;-><init>()V

    .line 53
    .line 54
    .line 55
    const/16 v18, 0x1

    .line 56
    .line 57
    const/16 v19, 0x0

    .line 58
    .line 59
    move-object v5, v15

    .line 60
    move-wide v10, v12

    .line 61
    move-wide/from16 v12, v16

    .line 62
    .line 63
    move-object v2, v15

    .line 64
    move/from16 v15, v18

    .line 65
    .line 66
    move-object/from16 v16, v19

    .line 67
    .line 68
    invoke-direct/range {v5 .. v16}, Lv2/c;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/util/Date;ILkotlin/jvm/internal/w;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Lcom/yuanqi/master/location/MapViewModel;->e(Lv2/c;)V

    .line 72
    .line 73
    .line 74
    const-string v1, "\u5730\u5740\u5df2\u4fdd\u5b58\uff01"

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    invoke-static {v1, v4, v3, v2}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-direct/range {p0 .. p0}, Lcom/yuanqi/master/location/MapActivity;->Y()V

    .line 81
    .line 82
    .line 83
    return-void
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

.method private static final m0(Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

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
.end method

.method private static final n0(Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V
    .locals 1

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroid/content/Intent;

    .line 7
    .line 8
    const-class v0, Lcom/yuanqi/master/location/HistoryActivity;

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    iget v0, p0, Lcom/yuanqi/master/location/MapActivity;->p:I

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 16
    .line 17
    .line 18
    return-void
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
.end method

.method private static final o0(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V
    .locals 1

    .line 1
    const-string p2, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$this_apply"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/yuanqi/master/location/MapActivity;->e:Landroidx/lifecycle/MutableLiveData;

    .line 12
    .line 13
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p1, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etSearch:Landroidx/appcompat/widget/AppCompatEditText;

    .line 19
    .line 20
    const-string v0, ""

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p1, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->etSearch:Landroidx/appcompat/widget/AppCompatEditText;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->b0()V

    .line 31
    .line 32
    .line 33
    return-void
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
    .line 89
    .line 90
.end method

.method private static final p0(Lcom/yuanqi/master/location/MapActivity;Landroid/location/Location;)V
    .locals 6

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    iget-object p1, p0, Lcom/yuanqi/master/location/MapActivity;->a:Ljava/lang/String;

    .line 20
    .line 21
    new-instance v4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v5, "onLocationChanged: "

    .line 27
    .line 28
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v5, ", "

    .line 35
    .line 36
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {p1, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    new-instance p1, Lorg/osmdroid/util/GeoPoint;

    .line 50
    .line 51
    invoke-direct {p1, v0, v1, v2, v3}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, p1}, Lcom/yuanqi/master/location/MapActivity;->X(Lorg/osmdroid/util/GeoPoint;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->x0()V

    .line 58
    .line 59
    .line 60
    return-void
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

.method private final q0(Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Lv3/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/appcompat/widget/AppCompatEditText;",
            "Landroid/widget/ImageView;",
            "Lv3/l<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/yuanqi/master/location/MapActivity$l;

    invoke-direct {v0, p2, p3}, Lcom/yuanqi/master/location/MapActivity$l;-><init>(Landroid/widget/ImageView;Lv3/l;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private final r0(Z)V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->t:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/location/MapActivity;->v:[Lkotlin/reflect/o;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/yuanqi/master/tools/x0;->setValue(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method

.method private final s0()V
    .locals 15

    .line 1
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "inflate(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lcom/yuanqi/master/tools/dialog/b$a;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Lcom/yuanqi/master/tools/dialog/b$a;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/yuanqi/master/tools/dialog/b$a;->a()Lcom/yuanqi/master/tools/dialog/b$a;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0}, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Lcom/yuanqi/master/tools/dialog/b$a;->k(Landroid/view/View;)Lcom/yuanqi/master/tools/dialog/b$a;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-virtual {v1, v2}, Lcom/yuanqi/master/tools/dialog/b$a;->i(Z)Lcom/yuanqi/master/tools/dialog/b$a;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    sget-object v2, Lcom/yuanqi/master/tools/c1;->a:Lcom/yuanqi/master/tools/c1$a;

    .line 37
    .line 38
    const/high16 v3, 0x43960000    # 300.0f

    .line 39
    .line 40
    invoke-virtual {v2, p0, v3}, Lcom/yuanqi/master/tools/c1$a;->c(Landroid/content/Context;F)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v3, -0x2

    .line 45
    invoke-virtual {v1, v2, v3}, Lcom/yuanqi/master/tools/dialog/b$a;->t(II)Lcom/yuanqi/master/tools/dialog/b$a;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lcom/yuanqi/master/tools/dialog/b$a;->b()Lcom/yuanqi/master/tools/dialog/b;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v8, "\u8bf7\u6ce8\u610f\uff1a\n1. \u4e3a\u4fdd\u8bc1\u8be5\u529f\u80fd\u6b63\u5e38\u4f7f\u7528\uff0c\u5efa\u8bae\u60a8\u5c06 \u5143\u6c14\u591a\u5f00 \u53ca\u9700\u8981 \u591a\u5f00\u7684\u539f\u5e94\u7528 \u4f4d\u7f6e\u6743\u9650\u8bbe\u7f6e\u4e3a \u59cb\u7ec8\u5141\u8bb8\uff1b\n2. \u8c03\u6574\u4f4d\u7f6e\u540e\uff0c\u518d\u542f\u52a8\u5206\u8eab\u5e94\u7528\uff0c\u82e5\u4f4d\u7f6e\u4fe1\u606f\u672a\u751f\u6548\uff0c\u53ef\u5c1d\u8bd5\u540e\u53f0\u5173\u95ed\u5206\u8eab\u5e94\u7528\uff0c\u518d\u6b21\u542f\u52a8\u66f4\u65b0\u4f4d\u7f6e\u4fe1\u606f\u3002"

    .line 54
    .line 55
    new-instance v9, Landroid/text/SpannableString;

    .line 56
    .line 57
    invoke-direct {v9, v8}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    new-instance v10, Landroid/text/style/ForegroundColorSpan;

    .line 61
    .line 62
    const v11, 0x7f060080

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v11}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-direct {v10, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 70
    .line 71
    .line 72
    const-string v3, "\u5143\u6c14\u591a\u5f00"

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x6

    .line 77
    const/4 v7, 0x0

    .line 78
    move-object v2, v8

    .line 79
    invoke-static/range {v2 .. v7}, Lkotlin/text/v;->p3(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    const-string v3, "\u5143\u6c14\u591a\u5f00"

    .line 84
    .line 85
    invoke-static/range {v2 .. v7}, Lkotlin/text/v;->p3(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    const/4 v13, 0x4

    .line 90
    add-int/2addr v2, v13

    .line 91
    const/4 v14, 0x0

    .line 92
    invoke-virtual {v9, v10, v12, v2, v14}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 93
    .line 94
    .line 95
    new-instance v10, Landroid/text/style/ForegroundColorSpan;

    .line 96
    .line 97
    invoke-static {p0, v11}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-direct {v10, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 102
    .line 103
    .line 104
    const-string v3, "\u591a\u5f00\u7684\u539f\u5e94\u7528"

    .line 105
    .line 106
    move-object v2, v8

    .line 107
    invoke-static/range {v2 .. v7}, Lkotlin/text/v;->p3(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 108
    .line 109
    .line 110
    move-result v12

    .line 111
    const-string v3, "\u591a\u5f00\u7684\u539f\u5e94\u7528"

    .line 112
    .line 113
    invoke-static/range {v2 .. v7}, Lkotlin/text/v;->p3(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    add-int/lit8 v2, v2, 0x6

    .line 118
    .line 119
    invoke-virtual {v9, v10, v12, v2, v14}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 120
    .line 121
    .line 122
    new-instance v10, Landroid/text/style/ForegroundColorSpan;

    .line 123
    .line 124
    invoke-static {p0, v11}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    invoke-direct {v10, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 129
    .line 130
    .line 131
    const-string v3, "\u59cb\u7ec8\u5141\u8bb8"

    .line 132
    .line 133
    move-object v2, v8

    .line 134
    invoke-static/range {v2 .. v7}, Lkotlin/text/v;->p3(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    const-string v3, "\u59cb\u7ec8\u5141\u8bb8"

    .line 139
    .line 140
    invoke-static/range {v2 .. v7}, Lkotlin/text/v;->p3(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    add-int/2addr v2, v13

    .line 145
    invoke-virtual {v9, v10, v11, v2, v14}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 146
    .line 147
    .line 148
    iget-object v2, v0, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->tvTitle:Landroid/widget/TextView;

    .line 149
    .line 150
    const v3, 0x7f1202cb

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    iget-object v2, v0, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->tvContent:Landroid/widget/TextView;

    .line 161
    .line 162
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    iget-object v2, v0, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->tvContent:Landroid/widget/TextView;

    .line 166
    .line 167
    const/high16 v3, 0x41800000    # 16.0f

    .line 168
    .line 169
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 170
    .line 171
    .line 172
    iget-object v2, v0, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->btnRefuse:Lcom/google/android/material/button/MaterialButton;

    .line 173
    .line 174
    invoke-virtual {v2, v13}, Landroid/view/View;->setVisibility(I)V

    .line 175
    .line 176
    .line 177
    iget-object v2, v0, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->btnConfirm:Lcom/google/android/material/button/MaterialButton;

    .line 178
    .line 179
    const v3, 0x7f120123

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 187
    .line 188
    .line 189
    iget-object v2, v0, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->ivClose:Landroid/widget/ImageView;

    .line 190
    .line 191
    invoke-virtual {v2, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 192
    .line 193
    .line 194
    iget-object v2, v0, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->ivClose:Landroid/widget/ImageView;

    .line 195
    .line 196
    new-instance v3, Lcom/yuanqi/master/location/b;

    .line 197
    .line 198
    invoke-direct {v3, v1}, Lcom/yuanqi/master/location/b;-><init>(Lcom/yuanqi/master/tools/dialog/b;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    .line 203
    .line 204
    iget-object v0, v0, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->btnConfirm:Lcom/google/android/material/button/MaterialButton;

    .line 205
    .line 206
    new-instance v2, Lcom/yuanqi/master/location/g;

    .line 207
    .line 208
    invoke-direct {v2, v1}, Lcom/yuanqi/master/location/g;-><init>(Lcom/yuanqi/master/tools/dialog/b;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Lcom/yuanqi/master/location/h;

    .line 215
    .line 216
    invoke-direct {v0, p0}, Lcom/yuanqi/master/location/h;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 223
    .line 224
    .line 225
    return-void
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method private static final t0(Lcom/yuanqi/master/tools/dialog/b;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method private static final u0(Lcom/yuanqi/master/tools/dialog/b;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method private static final v0(Lcom/yuanqi/master/location/MapActivity;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-direct {p0, p1}, Lcom/yuanqi/master/location/MapActivity;->r0(Z)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method private final w0()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/yuanqi/master/location/MapActivity;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->r:Landroid/location/LocationManager;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "locationManager"

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    move-object v1, v0

    .line 16
    const-string v2, "network"

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    iget-object v6, p0, Lcom/yuanqi/master/location/MapActivity;->u:Landroid/location/LocationListener;

    .line 22
    .line 23
    invoke-virtual/range {v1 .. v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    .line 24
    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/yuanqi/master/location/MapActivity;->s:Z

    .line 27
    .line 28
    xor-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    iput-boolean v0, p0, Lcom/yuanqi/master/location/MapActivity;->s:Z

    .line 31
    .line 32
    :cond_1
    return-void
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
.end method

.method private final x0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/yuanqi/master/location/MapActivity;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->r:Landroid/location/LocationManager;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "locationManager"

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/yuanqi/master/location/MapActivity;->u:Landroid/location/LocationListener;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 18
    .line 19
    .line 20
    iget-boolean v0, p0, Lcom/yuanqi/master/location/MapActivity;->s:Z

    .line 21
    .line 22
    xor-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/yuanqi/master/location/MapActivity;->s:Z

    .line 25
    .line 26
    :cond_1
    return-void
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
.end method


# virtual methods
.method public a(Landroid/view/View;I)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Lcom/yuanqi/master/location/MapActivity;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/yuanqi/master/network/model/CustomAddress;

    .line 8
    .line 9
    new-instance p2, Lorg/osmdroid/util/GeoPoint;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/CustomAddress;->getLat()D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/CustomAddress;->getLng()D

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-direct {p2, v0, v1, v2, v3}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p2}, Lcom/yuanqi/master/location/MapActivity;->X(Lorg/osmdroid/util/GeoPoint;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/yuanqi/master/location/MapActivity;->e:Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->b0()V

    .line 33
    .line 34
    .line 35
    return-void
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
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    const-class v0, Lcom/yuanqi/master/location/MapActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "inflate(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/yuanqi/master/location/MapActivity;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    const-string p1, "binding"

    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    :cond_0
    invoke-virtual {p1}, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    const-string p1, "location"

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v0, "null cannot be cast to non-null type android.location.LocationManager"

    .line 50
    .line 51
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    check-cast p1, Landroid/location/LocationManager;

    .line 55
    .line 56
    iput-object p1, p0, Lcom/yuanqi/master/location/MapActivity;->r:Landroid/location/LocationManager;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v0, "virtual.extras.appName"

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string v0, ""

    .line 69
    .line 70
    if-nez p1, :cond_1

    .line 71
    .line 72
    move-object p1, v0

    .line 73
    :cond_1
    iput-object p1, p0, Lcom/yuanqi/master/location/MapActivity;->h:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const-string v1, "virtual.extras.package"

    .line 80
    .line 81
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-nez p1, :cond_2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    move-object v0, p1

    .line 89
    :goto_0
    iput-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->i:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const-string v0, "virtual.extras.userid"

    .line 96
    .line 97
    const/4 v1, -0x1

    .line 98
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iput p1, p0, Lcom/yuanqi/master/location/MapActivity;->k:I

    .line 103
    .line 104
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->c0()V

    .line 105
    .line 106
    .line 107
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->e0()V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->d0()V

    .line 111
    .line 112
    .line 113
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->a0()Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_3

    .line 118
    .line 119
    invoke-direct {p0}, Lcom/yuanqi/master/location/MapActivity;->s0()V

    .line 120
    .line 121
    .line 122
    :cond_3
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 123
    .line 124
    .line 125
    return-void
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
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

.method protected onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "binding"

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    iget-object v0, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->map:Lorg/osmdroid/views/MapView;

    .line 15
    .line 16
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->onPause()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method protected onRestart()V
    .locals 1

    const-class v0, Lcom/yuanqi/master/location/MapActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 1
    const-class v0, Lcom/yuanqi/master/location/MapActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "binding"

    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    :cond_0
    iget-object v0, v0, Lcom/yqtech/multiapp/databinding/ActivityMapBinding;->map:Lorg/osmdroid/views/MapView;

    .line 24
    .line 25
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->onResume()V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    .line 29
    .line 30
    .line 31
    return-void
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
.end method

.method protected onStart()V
    .locals 1

    const-class v0, Lcom/yuanqi/master/location/MapActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
