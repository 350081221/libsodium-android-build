.class public final Lcom/lody/virtual/server/pm/FastImmutableArraySet;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/pm/FastImmutableArraySet$FastIterator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractSet<",
        "TT;>;"
    }
.end annotation


# instance fields
.field mContents:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field

.field mIterator:Lcom/lody/virtual/server/pm/FastImmutableArraySet$FastIterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/lody/virtual/server/pm/FastImmutableArraySet$FastIterator<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lody/virtual/server/pm/FastImmutableArraySet;->mContents:[Ljava/lang/Object;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/FastImmutableArraySet;->mIterator:Lcom/lody/virtual/server/pm/FastImmutableArraySet$FastIterator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/lody/virtual/server/pm/FastImmutableArraySet$FastIterator;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/lody/virtual/server/pm/FastImmutableArraySet;->mContents:[Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/lody/virtual/server/pm/FastImmutableArraySet$FastIterator;-><init>([Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/lody/virtual/server/pm/FastImmutableArraySet;->mIterator:Lcom/lody/virtual/server/pm/FastImmutableArraySet$FastIterator;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    iput v1, v0, Lcom/lody/virtual/server/pm/FastImmutableArraySet$FastIterator;->mIndex:I

    .line 17
    .line 18
    :goto_0
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/pm/FastImmutableArraySet;->mContents:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method
