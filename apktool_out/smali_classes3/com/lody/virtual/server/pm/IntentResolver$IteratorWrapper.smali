.class Lcom/lody/virtual/server/pm/IntentResolver$IteratorWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/pm/IntentResolver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "IteratorWrapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TF;>;"
    }
.end annotation


# instance fields
.field private mCur:Lcom/lody/virtual/server/pm/parser/VPackage$IntentInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TF;"
        }
    .end annotation
.end field

.field private mI:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TF;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/lody/virtual/server/pm/IntentResolver;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/pm/IntentResolver;Ljava/util/Iterator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "TF;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/server/pm/IntentResolver$IteratorWrapper;->this$0:Lcom/lody/virtual/server/pm/IntentResolver;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/lody/virtual/server/pm/IntentResolver$IteratorWrapper;->mI:Ljava/util/Iterator;

    .line 7
    .line 8
    return-void
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


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/pm/IntentResolver$IteratorWrapper;->mI:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Lcom/lody/virtual/server/pm/parser/VPackage$IntentInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TF;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/lody/virtual/server/pm/IntentResolver$IteratorWrapper;->mI:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/lody/virtual/server/pm/parser/VPackage$IntentInfo;

    iput-object v0, p0, Lcom/lody/virtual/server/pm/IntentResolver$IteratorWrapper;->mCur:Lcom/lody/virtual/server/pm/parser/VPackage$IntentInfo;

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/server/pm/IntentResolver$IteratorWrapper;->next()Lcom/lody/virtual/server/pm/parser/VPackage$IntentInfo;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/IntentResolver$IteratorWrapper;->mCur:Lcom/lody/virtual/server/pm/parser/VPackage$IntentInfo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/lody/virtual/server/pm/IntentResolver$IteratorWrapper;->this$0:Lcom/lody/virtual/server/pm/IntentResolver;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lcom/lody/virtual/server/pm/IntentResolver;->removeFilterInternal(Lcom/lody/virtual/server/pm/parser/VPackage$IntentInfo;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/IntentResolver$IteratorWrapper;->mI:Ljava/util/Iterator;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
