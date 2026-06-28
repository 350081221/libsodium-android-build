.class public final Lcom/lody/virtual/server/am/AttributeCache$Package;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/am/AttributeCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Package"
.end annotation


# instance fields
.field private final mMap:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/HashMap<",
            "[I",
            "Lcom/lody/virtual/server/am/AttributeCache$Entry;",
            ">;>;"
        }
    .end annotation
.end field

.field public final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lody/virtual/server/am/AttributeCache$Package;->mMap:Landroid/util/SparseArray;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/lody/virtual/server/am/AttributeCache$Package;->resources:Landroid/content/res/Resources;

    .line 12
    .line 13
    return-void
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
.end method

.method static synthetic access$000(Lcom/lody/virtual/server/am/AttributeCache$Package;)Landroid/util/SparseArray;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/am/AttributeCache$Package;->mMap:Landroid/util/SparseArray;

    return-object p0
.end method
