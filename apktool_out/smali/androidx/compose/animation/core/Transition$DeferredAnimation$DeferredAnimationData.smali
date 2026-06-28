.class public final Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/State;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/animation/core/Transition$DeferredAnimation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "DeferredAnimationData"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V:",
        "Landroidx/compose/animation/core/AnimationVector;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/compose/runtime/State<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0080\u0004\u0018\u0000*\u0004\u0008\u0003\u0010\u0001*\u0008\u0008\u0004\u0010\u0003*\u00020\u00022\u0008\u0012\u0004\u0012\u00028\u00030\u0004Bm\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\u0008\u0012\u0004\u0012\u00028\u00000\n\u0012#\u0010\u0012\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00030\u00100\u000f\u00a2\u0006\u0002\u0008\u0011\u0012!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u001a\u0012\u0004\u0012\u00028\u00030\u000f\u00a2\u0006\u0004\u0008!\u0010\"J\u0014\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005R-\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\u0008\u0012\u0004\u0012\u00028\u00000\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR?\u0010\u0012\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00030\u00100\u000f\u00a2\u0006\u0002\u0008\u00118\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R=\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u001a\u0012\u0004\u0012\u00028\u00030\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u0013\u001a\u0004\u0008\u001c\u0010\u0015\"\u0004\u0008\u001d\u0010\u0017R\u0014\u0010 \u001a\u00028\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;",
        "T",
        "Landroidx/compose/animation/core/AnimationVector;",
        "V",
        "Landroidx/compose/runtime/State;",
        "Landroidx/compose/animation/core/Transition$Segment;",
        "segment",
        "Lkotlin/r2;",
        "updateAnimationStates",
        "Landroidx/compose/animation/core/Transition$TransitionAnimationState;",
        "Landroidx/compose/animation/core/Transition;",
        "animation",
        "Landroidx/compose/animation/core/Transition$TransitionAnimationState;",
        "getAnimation",
        "()Landroidx/compose/animation/core/Transition$TransitionAnimationState;",
        "Lkotlin/Function1;",
        "Landroidx/compose/animation/core/FiniteAnimationSpec;",
        "Lkotlin/u;",
        "transitionSpec",
        "Lv3/l;",
        "getTransitionSpec",
        "()Lv3/l;",
        "setTransitionSpec",
        "(Lv3/l;)V",
        "Lkotlin/v0;",
        "name",
        "state",
        "targetValueByState",
        "getTargetValueByState",
        "setTargetValueByState",
        "getValue",
        "()Ljava/lang/Object;",
        "value",
        "<init>",
        "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lv3/l;Lv3/l;)V",
        "animation-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final animation:Landroidx/compose/animation/core/Transition$TransitionAnimationState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Transition<",
            "TS;>.TransitionAnimationState<TT;TV;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private targetValueByState:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "-TS;+TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field final synthetic this$0:Landroidx/compose/animation/core/Transition$DeferredAnimation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Transition<",
            "TS;>.DeferredAnimation<TT;TV;>;"
        }
    .end annotation
.end field

.field private transitionSpec:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "-",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;+",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lv3/l;Lv3/l;)V
    .locals 0
    .param p1    # Landroidx/compose/animation/core/Transition$DeferredAnimation;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/animation/core/Transition$TransitionAnimationState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>.TransitionAnimationState<TT;TV;>;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;+",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "TT;>;>;",
            "Lv3/l<",
            "-TS;+TT;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->this$0:Landroidx/compose/animation/core/Transition$DeferredAnimation;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->animation:Landroidx/compose/animation/core/Transition$TransitionAnimationState;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->transitionSpec:Lv3/l;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->targetValueByState:Lv3/l;

    .line 11
    .line 12
    return-void
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
.end method


# virtual methods
.method public final getAnimation()Landroidx/compose/animation/core/Transition$TransitionAnimationState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>.TransitionAnimationState<TT;TV;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->animation:Landroidx/compose/animation/core/Transition$TransitionAnimationState;

    return-object v0
.end method

.method public final getTargetValueByState()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "TS;TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->targetValueByState:Lv3/l;

    return-object v0
.end method

.method public final getTransitionSpec()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->transitionSpec:Lv3/l;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->this$0:Landroidx/compose/animation/core/Transition$DeferredAnimation;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/compose/animation/core/Transition$DeferredAnimation;->this$0:Landroidx/compose/animation/core/Transition;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->updateAnimationStates(Landroidx/compose/animation/core/Transition$Segment;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->animation:Landroidx/compose/animation/core/Transition$TransitionAnimationState;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition$TransitionAnimationState;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
    .line 19
.end method

.method public final setTargetValueByState(Lv3/l;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-TS;+TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->targetValueByState:Lv3/l;

    return-void
.end method

.method public final setTransitionSpec(Lv3/l;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;+",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "TT;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->transitionSpec:Lv3/l;

    return-void
.end method

.method public final updateAnimationStates(Landroidx/compose/animation/core/Transition$Segment;)V
    .locals 4
    .param p1    # Landroidx/compose/animation/core/Transition$Segment;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->targetValueByState:Lv3/l;

    .line 2
    .line 3
    invoke-interface {p1}, Landroidx/compose/animation/core/Transition$Segment;->getTargetState()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->this$0:Landroidx/compose/animation/core/Transition$DeferredAnimation;

    .line 12
    .line 13
    iget-object v1, v1, Landroidx/compose/animation/core/Transition$DeferredAnimation;->this$0:Landroidx/compose/animation/core/Transition;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->isSeeking()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->targetValueByState:Lv3/l;

    .line 22
    .line 23
    invoke-interface {p1}, Landroidx/compose/animation/core/Transition$Segment;->getInitialState()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v1, v2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->animation:Landroidx/compose/animation/core/Transition$TransitionAnimationState;

    .line 32
    .line 33
    iget-object v3, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->transitionSpec:Lv3/l;

    .line 34
    .line 35
    invoke-interface {v3, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 40
    .line 41
    invoke-virtual {v2, v1, v0, p1}, Landroidx/compose/animation/core/Transition$TransitionAnimationState;->updateInitialAndTargetValue$animation_core_release(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object v1, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->animation:Landroidx/compose/animation/core/Transition$TransitionAnimationState;

    .line 46
    .line 47
    iget-object v2, p0, Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;->transitionSpec:Lv3/l;

    .line 48
    .line 49
    invoke-interface {v2, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 54
    .line 55
    invoke-virtual {v1, v0, p1}, Landroidx/compose/animation/core/Transition$TransitionAnimationState;->updateTargetValue$animation_core_release(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    return-void
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
